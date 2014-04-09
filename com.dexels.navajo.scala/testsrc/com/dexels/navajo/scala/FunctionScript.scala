package com.dexels.navajo.scala

import com.dexels.navajo.scala.document.NavajoRuntime

class FunctionScript extends ScalaCompiledScript with Functions {
  override def run(a: NavajoRuntime) {
	  
	a.output.addMessage("Simple").one(f=>{
	  f.addProperty("Binary").description("shake the room").value(ToSecureImage("boooom"));
	  
	});

  }
}