package com.dexels.navajo.scala

import com.dexels.navajo.scala.document.NavajoRuntime

class AdapterScript extends ScalaCompiledScript with Functions {
  override def run(a: NavajoRuntime) {

	a.output.addMessage("Simple").one(f=>{
		
	  
	});

  }
}