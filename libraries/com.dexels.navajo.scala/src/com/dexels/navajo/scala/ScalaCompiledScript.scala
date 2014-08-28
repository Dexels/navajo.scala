package com.dexels.navajo.scala

import com.dexels.navajo.document.Navajo
import com.dexels.navajo.mapping.CompiledScript
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.script.api.Mappable
import com.dexels.navajo.scala.document.NavajoDocument
import com.dexels.navajo.scala.document.NavajoRuntime
import scala.collection.mutable.ListBuffer
import com.dexels.navajo.document.NavajoFactory
import com.dexels.navajo.document.NavajoFactory

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
    myAccess = a
    runtime = new NavajoRuntime(a)
    run()
  }

  def run()

  def callScript(input: NavajoDocument, withResult: NavajoDocument => Unit) {

  }

  def callRemoteScript(resource: String, input: NavajoDocument, withResult: NavajoDocument => Unit) {

  }

  def callAdapter(adapter: Class[_ <: Mappable], withMap: Mappable => Unit) {

  }

  def input[T <: NavajoDocument] : T = {
    new NavajoDocument(myAccess.getInDoc()).asInstanceOf[T];
  }

  def output[T <: NavajoDocument] : T = {
     new NavajoDocument(myAccess.getOutputDoc()).asInstanceOf[T];
  }
    
  def scriptAccess: Access = {
    return myAccess
  }

  def test {
  }

}