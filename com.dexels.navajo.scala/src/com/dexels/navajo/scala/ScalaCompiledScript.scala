package com.dexels.navajo.scala

import com.dexels.navajo.document.Navajo
import com.dexels.navajo.mapping.CompiledScript
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.script.api.Mappable
import com.dexels.navajo.scala.document.NavajoDocument
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.document.NavajoRuntime
import scala.collection.mutable.ListBuffer
abstract class ScalaCompiledScript extends CompiledScript {
  var runtime: NavajoRuntime = null
  val validations = new ListBuffer[NavajoRuntime => Boolean]

  override def finalBlock(a: Access) {

  }

  override def setValidations() {
    //runtime.input.property("")
  }

  def addValidation(validation: NavajoRuntime => Boolean) {
    validations.append(validation)
  }

  override def execute(a: Access) {
    runtime = new NavajoRuntime(scriptAccess)
    run(runtime)
  }

  def run(r: NavajoRuntime)

  def callScript(input: NavajoDocument, withResult: NavajoDocument => Unit) {

  }

  def callRemoteScript(resource: String, input: NavajoDocument, withResult: NavajoDocument => Unit) {

  }

  def callAdapter(adapter: Class[_ <: Mappable], withMap: Mappable => Unit) {

  }

  def input: NavajoDocument = {
    new NavajoDocument(getInDoc());
  }

  def scriptAccess: Access = {
    return myAccess
  }

  def test {
  }

}