package testscala

import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.scala.document.NavajoRuntime

class ScalaSimple extends ScalaCompiledScript {
  override def run(a: NavajoRuntime) {

	a.output.addMessage("Simple").one(f=>{
	  f.addProperty("boom").setDescription("shake the room")
	  
	});

  }
}