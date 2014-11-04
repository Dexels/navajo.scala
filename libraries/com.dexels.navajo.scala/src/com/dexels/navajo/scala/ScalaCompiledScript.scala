package com.dexels.navajo.scala

import com.dexels.navajo.document.Navajo
import com.dexels.navajo.mapping.CompiledScript
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.script.api.Mappable
import com.dexels.navajo.scala.document.NavajoDocument
import com.dexels.navajo.scala.document.NavajoRuntime
import scala.collection.mutable.ListBuffer
import com.dexels.navajo.document.NavajoFactory
import scala.reflect.ManifestFactory

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

    def callScript(script: String, input: NavajoDocument = null, withResult: NavajoDocument => Unit ) {

    }

    def callRemoteScript(resource: String, input: NavajoDocument, withResult: NavajoDocument => Unit) {

    }

    def callAdapter(adapter: Class[_ <: Mappable], withMap: Mappable => Unit) {

    }

    def inputEntity[P <:  NavajoDocument: Manifest]: P = {
        val constructor = manifest[P].erasure.getConstructor(classOf[Navajo])
        constructor.newInstance(myAccess.getInDoc()).asInstanceOf[P]   
        }

    def outputEntity[P <: NavajoDocument: Manifest]: P  = {
        val constructor = manifest[P].erasure.getConstructor(classOf[Navajo])
        constructor.newInstance(myAccess.getOutputDoc()).asInstanceOf[P]
    }
    
     def input = {
         this.inputEntity[NavajoDocument]
     }
    
     def output = 
     	this.outputEntity[NavajoDocument]
  

    def scriptAccess: Access = {
        return myAccess
    }

    def test {
    }

}