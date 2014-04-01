package com.dexels.navajo.scala.document

import com.dexels.navajo.document.Navajo


object NavajoFactory {
	def create(): NavajoDocument = {
	  new NavajoDocument(com.dexels.navajo.document.NavajoFactory.getInstance().createNavajo())
	}

	def create(parent: Navajo): NavajoDocument = {
	  new NavajoDocument(parent)
	}
	
	def createMessage(doc: NavajoDocument): NavajoMessage = {
	  new NavajoMessage(com.dexels.navajo.document.NavajoFactory.getInstance().createMessage(doc.parent))
	}

}