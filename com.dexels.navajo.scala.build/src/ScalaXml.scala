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
//com.dexels.navajo.functions.util

object ScalaXml {
  def main(args: Array[String]) {
    val is = ScalaXml.getClass().getClassLoader().getResourceAsStream("functions.xml");
    createFunctionTrait("Functions", "com.dexels.navajo.scala", is, new File("/Users/frank/git/navajo.scala/com.dexels.navajo.scala/src/com/dexels/navajo/scala"))
    is.close()

    val is2 = ScalaXml.getClass().getClassLoader().getResourceAsStream("adapters.xml");
    createFunctionTrait("Adapters", "com.dexels.navajo.scala", is2, new File("/Users/frank/git/navajo.scala/com.dexels.navajo.scala/src/com/dexels/navajo/scala"))
    is2.close()

  }

  //	  <tagname>sqlquery</tagname>
  //	  <object>com.dexels.navajo.adapter.SQLMap</object>
 
  def createAdaptersTrait(name: String, packageName: String, is: InputStream, destination: File) {
    val xml = XML.load(is)
    val list = xml \\ "map"
    val maps = new ListBuffer[SymTree]()
    list.foreach((node: Node) => {
      val name = (node \\ "tagname").text
      val clz = (node \\ "object").text
      val values = (node \\ "values")
      val methods = (node \\ "methods")
    });
//     BLOCK((TRAITDEF(name) withParents ("com.dexels.navajo.scala.Base")) withSelf ("self", "com.dexels.navajo.scala.ScalaCompiledScript") := BLOCK(
//      functions)) inPackage (packageName)
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