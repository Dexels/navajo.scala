package com.dexels.navajo.scala.document

import com.dexels.navajo.document.Navajo
import com.dexels.navajo.document.Message

class NavajoDocument(val parent: Navajo) {
	def message (name: String): NavajoMessage = {
	   return new NavajoMessage(parent.getMessage(name));
	}

  def propertyValue(name: String): Any = {
		val p = property(name)
		if(p==null) {
		  return null
		}
		return p.value
  }
  
	def property(name: String): NavajoProperty = {
    val prop = parent.getProperty(name)
    if (prop == null) {
      parent.write(System.err)
      throw new NullPointerException("No property found: " + name);
    }
    return new NavajoProperty(prop)
  }
  
	
  def addMessage(name: String ) : NavajoMessage = {
    val message = NavajoFactory.createMessage(this,name)
    new NavajoMessage(parent.addMessage(NavajoFactory.createMessage(this,name).parent))
  }

    def addArrayMessage(name: String ) : NavajoMessage = {
    new NavajoMessage(parent.addMessage(NavajoFactory.createArrayMessage(this,name).parent))
  }
}