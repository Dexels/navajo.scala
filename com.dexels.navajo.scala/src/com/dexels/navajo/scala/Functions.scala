package com.dexels.navajo.scala

import com.dexels.navajo.document.types.Binary
import com.dexels.navajo.functions._
/*	<function name="ToSecureImage" class="com.dexels.navajo.functions.ToSecureImage">
		<description>Creates a Binary containing a PNG image representation of
			specified objects string representation&#xa; max. inputlength is 6
			chars
		</description>
		<input>string</input>
		<result>binary</result>
	</function>
*/
trait Functions { 
  this : ScalaCompiledScript =>
	def toSecureImage (input:String): Binary = {
	  val func = new ToSecureImage()
	  func.setAccess(this.getAccess())
	  func.setCurrentMessage(getCurrentOutMsg())
	  func.setInMessage(this.getAccess().getInDoc())
//	  func.setOutMessage(this.getAccess().getInDoc())
	  func.setCurrentMessage(getCurrentOutMsg())
	  func.insertOperand(input)
	  func.evaluate().asInstanceOf[Binary]
	} 
}