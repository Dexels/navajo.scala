package com.dexels.navajo.scala.document

import com.dexels.navajo.document.Message
import com.dexels.navajo.document.Property

class NavajoMessage(val parent: Message) {
  
  def rootDoc: NavajoDocument = {
    new NavajoDocument(parent.getRootDoc())
  }
  def message(name: String): NavajoMessage = {
    return new NavajoMessage(parent.getMessage(name));
  }

  def message(index: Int): NavajoMessage = {
    return new NavajoMessage(parent.getMessage(index));
  }
  
  def name: String = {
    parent.getName()
  }
  
  def setName(n: String): NavajoMessage = {
    parent.setName(n)
    return this
  }
  
  
  def addMessage(name: String ) : NavajoMessage = {
    val message = NavajoFactory.createMessage(rootDoc).setName(name)
    message.parent.write(System.out);
    new NavajoMessage(parent.addMessage(NavajoFactory.createMessage(rootDoc).parent))
  }

  def addMessage: NavajoMessage = {
    new NavajoMessage(parent.addElement(NavajoFactory.createMessage(rootDoc).parent))
  }
  
  def each(f: NavajoMessage => Unit) = {
    val it = parent.getAllMessages().iterator();
    while(it.hasNext()) {
      f(new NavajoMessage(it.next()));
    }
  }
  
  def one(f: NavajoMessage => Unit) = {
    f(this)
  }

  
  def property(name: String): NavajoProperty = {
    return new NavajoProperty(parent.getProperty(name));
  }

//    public abstract Property createProperty(Navajo tb, String name, String type,
//                                          String value, int length,
//                                          String description, String direction) throws
  
  def addProperty(name: String): NavajoProperty = {
    val p = com.dexels.navajo.document.NavajoFactory.getInstance().createProperty(parent.getRootDoc(), name, Property.STRING_PROPERTY, null, 0, null, Property.DIR_IN)
    parent.addProperty(p)
    return new NavajoProperty(p)
  }

  def addProperty(p: NavajoProperty): NavajoProperty = {
	  parent.addProperty(p.parent)
	  return p;
  }
}