import java.io.InputStream
import scala.xml.XML
import scala.xml.Node
import treehugger.forest._
import definitions._
import treehuggerDSL._
import java.util.ArrayList
import scala.collection.mutable.ListBuffer
import java.io.File
import java.io.PrintWriter
import com.dexels.navajo.document.NavajoFactory
import scala.xml.NodeSeq
//com.dexels.navajo.functions.util

object ScalaXml {
  def main(args: Array[String]) {
    val is = ScalaXml.getClass().getClassLoader().getResourceAsStream("functions.xml");
    createFunctionTrait("Functions", "com.dexels.navajo.scala", is, new File("/Users/frank/git/navajo.scala/com.dexels.navajo.scala/src/com/dexels/navajo/scala"))
    is.close()

    val is2 = ScalaXml.getClass().getClassLoader().getResourceAsStream("adapters.xml");
    createAdaptersTrait("Adapters", "com.dexels.navajo.scala", is2, new File("/Users/frank/git/navajo.scala/com.dexels.navajo.scala/src/com/dexels/navajo/scala"))
    is2.close()

  }

  def createAdaptersTrait(name: String, packageName: String, is: InputStream, destination: File) {
    val xml = XML.load(is)
    val list = xml \\ "map"
    val maps = new ListBuffer[SymTree]()
    val adapters = new ListBuffer[SymTree]()
    val adapterDefs = new ListBuffer[SymTree]()

    val adaptersTrait = BLOCK(
      List[Tree](
        IMPORT("com.dexels.navajo.scala.document._"),
        (TRAITDEF(name) withParents ("com.dexels.navajo.scala.BaseAdapters")) withSelf ("self", "com.dexels.navajo.scala.ScalaCompiledScript") :=

          BLOCK(

            for (node <- list) yield {
              val maptag = (node \\ "tagname").text
              val clz = (node \\ "object").text
              val values = (node \\ "values")
              val methods = (node \\ "methods")
              processMap(maptag, clz, values, methods, adapterDefs)
            }))

        ++

        createAdapters(list)) inPackage (packageName)

    val writer = new PrintWriter(new File(destination, name + ".scala"))

    writer.write(treeToString(adaptersTrait))
    writer.close()
  }

  def createAdapters(list: NodeSeq): Iterable[Tree] = {
    val result = new ListBuffer[Tree]

    list.foreach(f => {
      val maptag = (f \\ "tagname").text
      val clz = (f \\ "object").text
      val description = (f \\ "description")
      
      val values = (f \\ "values")
      val methods = (f \\ "methods")
      
      val classDef = (CLASSDEF(maptag.toUpperCase()) withParents ("Adapter")  := BLOCK(
        List(VAL("instance") := NEW(clz)) ++
          createValues(values) ++
          createMethods(methods))) withDoc(if (description.nonEmpty) description.text else "")
          
      result.append(classDef)
      //       			<value name="query" type="string" required="false" direction="in" />

    })
    return result
  }

  //  			<method name="doSend">
  //				<param name="value" field="doSend" type="boolean" required="automatic" value="true" />
  //			</method>

  def createMethods(methods: NodeSeq): Iterator[Tree] = {
    val result = new ListBuffer[Tree]
    (methods \\ "method").foreach(f => {
      System.err.println(">>" + f);
      val name = f.attribute("name").get.text
      val params = createParams(f \\ "param")
      result.append(
        DEF(name) withType UnitClass withParams (params) := BLOCK())
    })
    return result.iterator;
  }

  def createParams(params: NodeSeq): Iterable[ValDef] = {
    val result = new ListBuffer[ValDef]
    (params \\ "param").foreach(f => {
      val name = f.attribute("name").get.text
      val field = f.attribute("field").get.text
      val required = f.attribute("required").get.text
      val valueType = f.attribute("type").get.text
      //      val autoValue = f.attribute("value").get.text
      if (required.equals("automatic")) {
        //        result.append(
        //        	
        //            DEF(name) withType UnitClass := BLOCK(
        //            REF("instance") DOT field APPLY LIT(autoValue)))

      } else {
        result.append(PARAM(name) withType ((NavajoFactory.getInstance().getJavaType(valueType).getName())))
      }
    })
    return result
  }
  def createValues(values: NodeSeq): Iterator[Tree] = {
    val result = new ListBuffer[Tree]

    (values \\ "value").foreach(f => {
      //System.err.println("f: " + f);
      val name = f.attribute("name").get.text
      val required: Boolean = !f.attribute("required").isEmpty && f.attribute("required").equals("true")
      val isIn: Boolean = f.attribute("direction").get.text.equals("in")
      if (f.attribute("map").isDefined) {
        // only getters
      } else {
        if (f.attribute("type").isEmpty) {
          System.err.println("weird: " + f);
        } else {
          val valueType = f.attribute("type").get.text
          // create getter
          //                    result.append(
          //                      DEF(name) withType (NavajoFactory.getInstance().getJavaType(valueType).getName()) := BLOCK(
          //                        RETURN(REF("instance") DOT "get" + name.capitalize APPLY UNIT)))

          if (isIn) {
            result.append(
              DEF(name) withType UnitClass withParams (PARAM(name) withType (NavajoFactory.getInstance().getJavaType(valueType).getName())) := BLOCK(
                //        insertOperandList.append((REF("function") DOT "insertOperand") APPLY REF("arg" + i))

                REF("instance") DOT "set" + name.capitalize APPLY REF(name)))
          }
          // create setter
        }
      }

      //    	val s: String = f.attribute("name").get.text
      //      result.append(
      //        DEF(f.attribute("name").get.text) withParams (PARAM("message") withType ("NavajoMessage"), PARAM("f") withType (IntClass TYPE_=> UnitClass)) withType (UnitClass) := BLOCK())
    })
    return result.iterator
  }

  def processMap(name: String, clz: String, values: NodeSeq, methods: NodeSeq, adapterDefs: ListBuffer[SymTree]): DefDef = {
    return DEF(name) withParams (PARAM("message") withType ("NavajoMessage"), PARAM("f") withType (IntClass TYPE_=> UnitClass)) withType (UnitClass) := BLOCK(
    		VAL("instance") := NEW(name.toUpperCase()),
//        insertOperandList.append((REF("function") DOT "insertOperand") APPLY REF("arg" + i))
    		REF("setupMap") APPLY (REF("message"), REF("instance"), REF("f"))
//    		setupMap
//    		APPLY(REF("f")) withP
    )
  }

  def createFunctionTrait(name: String, packageName: String, is: InputStream, destination: File) {
    val xml = XML.load(is)
    val list = xml \\ "function"
    val functions = new ListBuffer[SymTree]()

    list.foreach((node: Node) => {
      val name = node.attribute("name").get.text
      val clz = node.attribute("class").get.text
      val desc = (node \\ "description").text
      val input = (node \\ "input").text
      val result = (node \\ "result").text
      processFunction(name, clz, desc, input, result, functions)
    });

    val functionTrait = createTrait(name, packageName, functions)
    val writer = new PrintWriter(new File(destination, name + ".scala"))

    writer.write(treeToString(functionTrait))
    writer.close()

  }

  def addMethodToTrait(functionTrait: ClassDef, name: String, clz: String) = {
    //    functionTrait.withComment("aap").
    //functionTrait.
  }
  //  	def toSecureImage (input:String): Binary = {
  //	  val function = setupFunction(new com.dexels.navajo.functions.ToSecureImage())
  //	  function.insertOperand(input)
  //	  function.evaluate().asInstanceOf[Binary]
  //	}

  //  	<function name="StoreBinary" class="com.dexels.navajo.functions.StoreBinary">
  //		<description>Store a binary object in Shared Store
  //		</description>
  //		<input>string, binary</input>
  //		<result>string</result>
  //	</function> 
  // 	<function name="Abs" class="com.dexels.navajo.functions.Abs">
  //		<description>Returns absolute value of a number</description>
  //		<input>float|integer</input>
  //		<result>integer|float</result>
  //	</function>

  //	def toSecureImage (input:String): Binary = {
  //	  val function = setupFunction(new com.dexels.navajo.functions.ToSecureImage())
  //	  function.insertOperand(input)
  //	  function.evaluate().asInstanceOf[Binary]
  //	}

  def processFunction(name: String, clz: String, desc: String, input: String, result: String, functions: ListBuffer[SymTree]): Unit = {
    if (input.indexOf("...") != -1) {
      System.err.println("Currying! TODO implement");
      return
    }
    val expandedParams = expandParams(input)

    expandedParams.foreach(params => {
      var i: Int = 0
      val paramList = new ListBuffer[ValDef]
      params.foreach(f => {
        val dataType = NavajoFactory.getInstance.getJavaType(f)
        val dataTypeGeneric = NavajoFactory.getInstance().getJavaTypeGeneric(f)
        if (dataTypeGeneric != null) {
          if ("*".equals(dataTypeGeneric)) {
            paramList.append(PARAM("arg" + i, dataType.getName()).withType("Any"))

          } else {
            paramList.append(PARAM("arg" + i, dataType.getName()).withType(dataTypeGeneric))
          }

        } else {
          paramList.append(PARAM("arg" + i, dataType.getName()))
        }
        i += 1
      })

      i = 0
      val insertOperandList = new ListBuffer[Tree]
      insertOperandList.append(VAL("function") := (THIS DOT "setupFunction")(NEW(clz)))
      params.foreach(f => {
        insertOperandList.append((REF("function") DOT "insertOperand") APPLY REF("arg" + i))
        i += 1
      })
      functions.append(
        DEF(name) withParams (paramList) := BLOCK(
          insertOperandList))
    })
  }

  def expandParams(parameters: String): ListBuffer[List[String]] = {
    val result = new ListBuffer[List[String]]
    if (parameters == null || "".equals(parameters)) {
      result.append(List())
      return result
    }
    val params = parameters.split(",")
    val matrix = new Array[Array[String]](params.length)
    var i: Int = 0;
    params.foreach(element => {
      val alternatives = element.split("\\|")
      matrix(i) = alternatives
      i += 1
    })
    buildParams(List[String](), matrix, result)
    return result
  }

  private def buildParams(selec: List[String], matrix: Array[Array[String]], result: ListBuffer[List[String]]): Unit = {
    val startAt = selec.length
    if (startAt == matrix.length) {
      // done
      result.append(selec)
      return
    }
    val current = matrix(startAt)
    current.foreach(alt => {
      if ("empty".equals(alt)) {
        // continue
        result.append(selec)
      } else {
        buildParams(selec :+ alt.trim, matrix, result)
      }

    })
  }

  def createTrait(name: String, packageName: String, functions: ListBuffer[SymTree]): PackageDef = {
    return BLOCK((TRAITDEF(name) withParents ("com.dexels.navajo.scala.Base")) withSelf ("self", "com.dexels.navajo.scala.ScalaCompiledScript") := BLOCK(
      functions)) inPackage (packageName)
  }

} 