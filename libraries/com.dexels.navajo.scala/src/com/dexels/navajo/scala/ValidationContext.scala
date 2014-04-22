package com.dexels.navajo.scala

import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.document.NavajoProperty

class ValidationContext(val runtime: NavajoRuntime) {

  def fail(code: Int) {

  }

  def property(path: String): NavajoProperty = {
    runtime.input.property(path)
  }
}