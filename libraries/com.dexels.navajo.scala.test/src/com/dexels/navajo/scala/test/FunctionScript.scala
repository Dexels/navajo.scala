package com.dexels.navajo.scala.test

import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.function.scala.api._

class FunctionScript extends ScalaCompiledScript with FunctionComponent {
  override def run() {
	  
	output.addMessage("Simple").one(f=>{
	  f.addProperty("Binary").description("shake the room").value(ToSecureImage("boooom"));
	  
	});

  }
}