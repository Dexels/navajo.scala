package com.dexels.navajo.scala.document

import com.dexels.navajo.document.Navajo
import com.dexels.navajo.document.Message

class NavajoDocument(val parent: Navajo) {
	def message (name: String): NavajoMessage = {
	   return new NavajoMessage(parent.getMessage(name));
	}

  
  def addMessage(name: String ) : NavajoMessage = {
    val message = NavajoFactory.createMessage(this).setName(name)
    new NavajoMessage(parent.addMessage(NavajoFactory.createMessage(this).parent))
  }

}