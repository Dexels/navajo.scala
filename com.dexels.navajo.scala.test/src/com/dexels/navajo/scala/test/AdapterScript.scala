package com.dexels.navajo.scala.test

import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.ScalaCompiledScript
import navajo.navajoadapters._

class AdapterScript extends ScalaCompiledScript {
  override def run(a: NavajoRuntime) {

	a.output.addMessage("Simple").one(f=>{
		
	  
	});

  }
}