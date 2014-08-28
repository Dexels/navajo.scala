package com.dexels.navajo.scala.test

import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.ScalaCompiledScript

class JoinScript extends ScalaCompiledScript {
  override def run() {
    val out = output.addArrayMessage("List");
    input.message("Input").freejoin(input.message("JoinInput"), (m1, m2) => {
      if (m1.property("Id").value.equals(m2.property("Id").value)) {
        val added = out.addMessage
        added.addProperty("Joined").value(m1.property("Value").value + " = " + m2.property("JoinValue").value)
      }
    })

  }
}