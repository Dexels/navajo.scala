package com.dexels.navajo.scala.test

import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.function.scala.api.FunctionComponent


class InputLoopScript extends ScalaCompiledScript with FunctionComponent {
  override def run() {
    val inputM  = input.message("Input")
    val outList = output.addArrayMessage("List")
    inputM.each(m => {
      val outm = outList.addMessage
      outm.addProperty("Element").value(m.property("Id").value)
      outm.addProperty("Secure").value(ToSecureImage(m.property("Id").value.asInstanceOf[String]))
      outm.addProperty("Money").value(ToMoney(10f).toString())
    })
  }
}