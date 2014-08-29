package com.dexels.navajo.scala.build

import treehugger.forest._
import treehugger.forest.definitions._
import treehugger.forest.treehuggerDSL._
import scala.collection.mutable.ListBuffer
import scala.xml.NodeSeq
import scala.collection.JavaConversions._
import java.io.File
import java.io.PrintWriter
import scala.xml.XML
import scala.collection.mutable.MutableList

object ScalaEntityXml extends ScalaXml  {
    val target = new File(projectHome , "navajo.scala/generated/com.dexels.navajo.entity.scala.api/src/")
    val entityDir =  new File(projectHome, "sportlink/scripts/entity")
    
     

    override def main(args: Array[String]) {
		if (!entityDir.exists()) {
			return;
		}
		entityDir.listFiles().foreach( file => 
		    if (file.isFile()) {
				val xml = getXmlFrom(file)
				generate(xml)
			}
		)
    }

    def getXmlFrom(f: File): scala.xml.Elem = {
         val content = scala.io.Source.fromFile(f).mkString
         XML.loadString(content)

    }

    def generate(xml : scala.xml.Elem) = {
        val message = xml \\ "message"
        if (message == null)
            throw new Exception("Empty entity!");

        val entityName = (message \ "@name").text

        // extends="navajo://e1, navajo://e2"
        val extendedEntities = """navajo://(\w+)""".r.findAllIn((message \ "@extends").text).matchData
        
        // Classes and traits we inherit from - NavajoDocument + and extended entities
        val extenders  =  MutableList[Type] (TYPE_REF(REF("NavajoDocument")))
        extendedEntities.foreach( e => 
            extenders.+=(TYPE_REF(REF(e.group(1)+"Entity")))
        )
        
        val classDef = BLOCK(
            List[Tree](
                IMPORT("com.dexels.navajo.scala.document.NavajoDocument"),
                (TRAITDEF(RootClass.newClass(entityName + "Entity")) withParents (extenders) := BLOCK(
                    List[Tree]()
                        ++ generateGetters(entityName, message \\ "property")
                        ++ generateSetters(entityName, message \\ "property"))))) inPackage ("com.dexels.navajo.entity.scala.api")

        val dstFile = new File(target, entityName + "Entity.scala")
        val writer = 
            new PrintWriter(dstFile)
        writer.write(treeToString(classDef))
        writer.close()
    }

    def generateGetters(entityName: String, properties: NodeSeq): Iterator[Tree] = {
        val result = new ListBuffer[Tree]
        properties.foreach(f => {
            val propertyName = (f \ "@name").text
            val evalType = evaluateReturnType((f \ "@type").text)
            // Getter

            result.append(
                DEF(propertyName) withType evalType := BLOCK(
                    // Check if property exists?
                    REF("parent")
                        DOT "getProperty" APPLY (LIT("/" + entityName + "/" + propertyName))
                        DOT "getTypedValue()"
                        DOT "asInstanceOf[" + evalType + "]"))
        })
        return result.iterator
    }

    def generateSetters(entityName: String, properties: NodeSeq): Iterator[Tree] = {
        val result = new ListBuffer[Tree]
        properties.foreach(f => {
            val propertyName = (f \ "@name").text
            val evalType = evaluateReturnType((f \ "@type").text)

            // Setter
            result.append(
                DEF(propertyName)
                    withParams (PARAM("newValue", "Any"))
                    := BLOCK(
                        // Create message if not exists
                        IF(REF("parent") DOT "getMessage" APPLY (LIT(entityName)) ANY_== NULL)
                            THEN
                            (REF("addMessage") APPLY (LIT(entityName))) ENDIF,

                        // Create property if not exists
                        IF(REF("parent") DOT "getProperty" APPLY (LIT("/" + entityName + "/" + propertyName)) ANY_== NULL)
                            THEN
                            (REF("message") APPLY (LIT(entityName)) DOT "addProperty" APPLY
                                (LIT(propertyName)) DOT "propertyType" APPLY (LIT((f \ "@type").text))
                                DOT "direction" APPLY (LIT((f \ "@direction").text))) ENDIF,

                        REF("parent")
                            DOT "getProperty" APPLY (LIT("/" + entityName + "/" + propertyName))
                            DOT "setValue" APPLY (REF("newValue")
                                DOT "asInstanceOf[" + evaluateReturnType((f \ "@type").text) + "]")))
        })
        return result.iterator
    }

   

}
  

