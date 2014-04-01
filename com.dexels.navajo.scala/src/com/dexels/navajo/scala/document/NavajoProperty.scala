package com.dexels.navajo.scala.document

import com.dexels.navajo.document.Property

class NavajoProperty(val parent: Property) {

  def value() = {
    parent.getTypedValue()
  }
  
  def setValue(o: Any): NavajoProperty = {
    parent.setAnyValue(o)
    return this
  }

  def propertyType: String = {
    parent.getType()
  }
  
  def setType(propertyType: String): NavajoProperty = {
    parent.setType(propertyType)
    return this
  }

  def description(): String = {
    parent.getDescription()
  }
  
  def setDescription(o: String): NavajoProperty = {
    parent.setDescription(o)
    return this
  }

  def cardinality(): String = {
    parent.getCardinality()
  }
  
  def setCardinality(o: String): NavajoProperty = {
    parent.setCardinality(o)
    return this
  }

  
  def direction(): String = {
    parent.getDirection()
  }
  
  def setDirection(o: String): NavajoProperty = {
    parent.setDirection(o)
    return this
  }
  
  
  def length(): Int = {
    parent.getLength()
  }
  
  def setLength(o: Int): NavajoProperty = {
    parent.setLength(o)
    return this
  }


  
}