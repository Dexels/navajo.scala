package com.dexels.navajo.scala

import com.dexels.navajo.document.Navajo
import com.dexels.navajo.mapping.CompiledScript
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.script.api.Mappable
import com.dexels.navajo.adapter.SQLMap
import com.dexels.navajo.scala.document.NavajoDocument
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.document.NavajoRuntime
abstract class ScalaCompiledScript extends CompiledScript {
	override def finalBlock(a: Access) {
	  
	}
	
	override def setValidations() {
	  
	}
	
	override def execute(a: Access) {
	  run(new NavajoRuntime(a))
	}
	
	def run(r: NavajoRuntime)
	  	
	def callScript(input: NavajoDocument, withResult: NavajoDocument=>Unit) {
	  
	}
	
	def callAdapter(adapter: Class[_ <: Mappable], withMap: Mappable=>Unit) {
	  
	}
	
	def input: NavajoDocument = {
	  new NavajoDocument(getInDoc());
	}



	
	def test {
	//  callAdapter(SQLM, withMap)
	}

}