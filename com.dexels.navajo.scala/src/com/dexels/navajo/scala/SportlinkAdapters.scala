package com.dexels.navajo.scala

import com.dexels.navajo.document.types.Binary
import com.dexels.navajo.adapter.SQLMap
import com.dexels.navajo.scala.document.NavajoMessage


trait SportlinkAdapters {
  this: ScalaCompiledScript =>
	  def codedropdown(message: NavajoMessage, a: CodeDropdown => Unit): Unit = {
	    val map = new CodeDropdown()
	    scriptAccess.setCurrentOutMessage(message.parent)
	    map.load(scriptAccess)
	    try {
	      a(map);
	    } catch {
	      case e: Exception => map.kill()
	    }
	    map.store()
	  }
}