package com.dexels.navajo.scala

import com.dexels.navajo.scala.document.NavajoRuntime

class InputLoopScript extends ScalaCompiledScript with Functions {
  override def run(a: NavajoRuntime) {
    val input = a.input.message("Input")
    val outList = a.output.addArrayMessage("List")
    input.each(m => {
      val outm = outList.addMessage
      outm.addProperty("Element").value(m.property("Id").value)
      outm.addProperty("Secure").value(ToSecureImage(m.property("Id").value.asInstanceOf[String]))
      outm.addProperty("Money").value(ToMoney(10f).toString())
    })
  }
}