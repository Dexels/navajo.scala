package com.dexels.navajo.scala

import com.dexels.navajo.scala.document.NavajoMessage
import com.dexels.navajo.parser.FunctionInterface
import com.dexels.navajo.script.api.Mappable

trait BaseAdapters {
  self: ScalaCompiledScript =>

  def setupMap[T <: Adapter](message: NavajoMessage, map: Adapter, a: T => Unit): T = {
    scriptAccess.setCurrentOutMessage(message.parent)
    map.load(scriptAccess)
    try {
      a(map.asInstanceOf[T]);
    } catch {
      case e: Throwable => {
          map.kill
          println("Exception in the map!")
          println ("" + e)
      }
      
    }
    map.store()
    return map.asInstanceOf[T]
  }

}