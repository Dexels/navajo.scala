package testscala

import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.scala.document.NavajoRuntime

class TestScalaSimple extends ScalaCompiledScript {
  override def run(a: NavajoRuntime) {

	a.output.addMessage("Simple");

  }
}