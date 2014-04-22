package com.dexels.navajo.scala.test

import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.ScalaCompiledScript

class FunctionScript extends ScalaCompiledScript with Functions {
  override def run(a: NavajoRuntime) {
	  
	a.output.addMessage("Simple").one(f=>{
	  f.addProperty("Binary").description("shake the room").value(ToSecureImage("boooom"));
	  
	});

  }
}