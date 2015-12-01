package com.dexels.navajo.scala.test

import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.ScalaScript
import com.dexels.navajo.function.scala.api.FunctionComponent

class FunctionScript extends ScalaScript with FunctionComponent {
  override def run() {
	  
	output.addMessage("Simple").one(f=>{
	  f.addProperty("Binary").description("shake the room").value(ToSecureImage("boooom"));
	  
	});

  }
}