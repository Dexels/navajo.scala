package com.dexels.navajo.scala

import com.dexels.navajo.scala.document.NavajoRuntime

class JoinScript extends ScalaCompiledScript {
  override def run(a: NavajoRuntime) {
    val out = a.output.addArrayMessage("List");
    a.input.message("Input").freejoin(a.input.message("JoinInput"), (m1, m2) => {
      if (m1.property("Id").value.equals(m2.property("Id").value)) {
        val added = out.addMessage
        added.addProperty("Joined").value(m1.property("Value").value + " = " + m2.property("JoinValue").value)
      }
    })

  }
}