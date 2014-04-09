package com.dexels.navajo.scala

import com.dexels.navajo.document.types.Binary
import com.dexels.navajo.adapter.SQLMap
import com.dexels.navajo.scala.document.NavajoMessage
import com.dexels.navajo.script.api.Mappable

trait Adapters extends BaseAdapters {
  this: ScalaCompiledScript =>
	  def sqlMap(message: NavajoMessage, a: SQL => Unit) = {
	    setupMap[SQL](message, new SQL(), a)
	  }

}