package com.dexels.navajo.scala

import com.dexels.navajo.document.types.Binary
import com.dexels.navajo.functions._
import com.dexels.navajo.adapter.SQLMap
/*	<function name="ToSecureImage" class="com.dexels.navajo.functions.ToSecureImage">
		<description>Creates a Binary containing a PNG image representation of
			specified objects string representation&#xa; max. inputlength is 6
			chars
		</description>
		<input>string</input>
		<result>binary</result>
	</function>
*/
trait Adapters {
  this: ScalaCompiledScript =>
  def sqlMap(a: SQL => Unit): Unit = {
    val map = new SQL()
    map.load(this.getAccess())
    try {
      a(map);
    } catch {
      case e: Exception => map.kill()
    }
    map.store()
  }
}