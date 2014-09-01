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
import com.dexels.navajo.entity.Key
import scala.collection.mutable.Map
import scala.collection.mutable.MutableList


class ScalaEntityXml extends ScalaXml  {
    val target = new File(projectHome , "navajo.scala/generated/com.dexels.navajo.entity.scala.api/src/")
    val entityDir =  new File(projectHome, "sportlink/scripts/entity")
    
     

   
    override def generate() {
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

        
        val entityKeys : Map[String, ListBuffer[String]] = Map()
        getKeys(entityKeys, message \ "property")
        
        // extends="navajo://e1, navajo://e2"
        val extendedEntities = """navajo://(\w+)""".r.findAllIn((message \ "@extends").text).matchData
        
        // Classes and traits we inherit from - NavajoDocument + and extended entities
        val extenders  =  MutableList[Type] (TYPE_REF(REF("NavajoDocument")))
        extendedEntities.foreach( e => 
            extenders.+=(TYPE_REF(REF(e.group(1)+"Entity")))
        )
        
        val entityName = (message \ "@name").text
     
        val classDef = BLOCK(
            List[Tree](
                IMPORT("com.dexels.navajo.scala.document.NavajoDocument"),
                (TRAITDEF(RootClass.newClass(entityName + "Entity")) withParents (extenders) := BLOCK(
                    List[Tree]()
                        ++ generateKeyMethods(entityKeys)
                        ++ generateGetters(entityName, message \\ "property")
                        ++ generateSetters(entityName, message \\ "property")
                       
                        )))) inPackage ("com.dexels.navajo.entity.scala.api")

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

    def generateKeyMethods(entityKeys: Map[String, ListBuffer[String]]): ListBuffer[Tree] = {
        val result = new ListBuffer[Tree]
        entityKeys.foreach(tuple => {
            val params : ListBuffer[ValDef] = new ListBuffer[ValDef]
            tuple._2.foreach(keyString => (
                     params.append(PARAM(keyString, "Any"))
            ))
            result.append(
                    DEF("get") 
                        withParams (params) := BLOCK() withComment("TODO"))
        })

       
        return result
    }

    def getKeys(entityKeys: Map[String, ListBuffer[String]], properties: NodeSeq) = {
        properties.foreach(f => {
            val name = (f \ "@name").text
            val key = (f \ "@key").text
            if (! Option(key).getOrElse("").isEmpty) {
                    var keyid = Key.getKeyId(key)
                	if (keyid == null) keyid = "default"
                	val coll = entityKeys.getOrElseUpdate(keyid, new ListBuffer[String]())
                	coll.append(name)
                
            }

        })

    }
}

object ScalaEntityXmlGenerator   {
    
    def main(args: Array[String]) {
		val scalaEntityXml = new ScalaEntityXml 
		scalaEntityXml.generate
    }
}
