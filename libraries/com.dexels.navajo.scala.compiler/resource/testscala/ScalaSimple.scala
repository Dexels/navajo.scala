package testscala

import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.scala.document.NavajoRuntime

class ScalaSimple extends ScalaCompiledScript {
  override def run() {

	output.addMessage("Simple").one(f=>{
	  f.addProperty("boom").description("shake the room")
	  
	});

  }
}