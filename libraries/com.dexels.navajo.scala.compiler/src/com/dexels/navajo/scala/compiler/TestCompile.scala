package com.dexels.navajo.scala.compiler

import java.io._
import scala.tools.nsc.Settings
import scala.tools.nsc.Global

object TestCompile {
  def main(args: Array[String]) {
    val settings = new Settings()
    settings.processArgumentString("-usejavacp")
    val g = new Global(settings)
    val run = new g.Run

    run.compile( List("/home/chris/dexels/navajo.scala/libraries/com.dexels.navajo.scala.compiler/resource/testscala/ScalaSimple.scala")) // invoke compiler. it creates Test.class.
    val url = new File("/home/chris/dexels/navajo.scala/libraries/com.dexels.navajo.scala.compiler").toURI.toURL

    System.err.println("URL: "+url);
    val classLoader = new java.net.URLClassLoader(
      Array(url)  , this.getClass.getClassLoader)

    val clazz = classLoader.loadClass("testscala.ScalaSimple") // load class 

    clazz.newInstance // create an instance, which will print Hello World.

  }
}