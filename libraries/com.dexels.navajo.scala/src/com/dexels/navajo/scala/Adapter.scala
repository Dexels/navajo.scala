package com.dexels.navajo.scala

import com.dexels.navajo.script.api.Access

abstract class Adapter {

  def load(access: Access): Unit = {

  }

  def store(): Unit = {

  }

  def kill(): Unit = {

  }

}