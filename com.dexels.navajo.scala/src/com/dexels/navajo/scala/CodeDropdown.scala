package com.dexels.navajo.scala

import com.dexels.sportlink.adapters.CodeDropdownList

class CodeDropdown extends Adapter {
  
  val instance: CodeDropdownList = new CodeDropdownList

  def orderByDescription(b: Boolean): CodeDropdown = {
    instance.setOrderByDescription(b)
    return this
  }
  def orderByDescription: Boolean = {
    return instance.isOrderByDescription()
  } 

  def language(language: String): CodeDropdown = {
    instance.setLanguage(language)
    return this
  }

  def language: String = {
    return instance.getLanguage()
  }

  def name: String = {
    return instance.getName()
  }

  def name(n: String): CodeDropdown = {
    instance.setName(n)
    return this
  }

  def description: String = {
    return instance.getDescription()
  }

  def description(n: String): CodeDropdown = {
    instance.setDescription(n)
    return this
  }

  def direction: String = {
    return instance.getDirection()
  }

  def direction(n: String): CodeDropdown = {
    instance.setDirection(n)
    return this
  }

  def transactioncontext(n: Int): CodeDropdown = {
    instance.setTransactionContext(n)
    return this
  }

  def transactioncontext(): Int = {
    return instance.getTransactionContext()
  }

  def typeOfCode: String = {
    return instance.getTypeOfCode()
  }

  def typeOfCode(n: String): CodeDropdown = {
    instance.setTypeOfCode(n)
    return this
  }

  def selectedValue(n: String): CodeDropdown = {
    instance.setSelectedValue(n);
    return this
  }
  
  def selectedValue: String = {
    return instance.getSelectedValue()
  }

  def emptyOption(n: Boolean): CodeDropdown = {
    	instance.setEmptyOption(n)
    	return this
  }

  def emptyOption: Boolean = {
    	return instance.getEmptyOption
  }


}