package com.dexels.navajo.scala
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.document.Navajo
import com.dexels.navajo.adapter.SQLMap
import com.dexels.navajo.scala.document.NavajoFactory
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.document.NavajoMessage

class Script extends ScalaCompiledScript with Functions with Adapters {

  override def run(a: NavajoRuntime) {
    toSecureImage("aap");
    val tralala = a.input.message("Tra")

    tralala.each(msg => {
      msg.property("MyProp").setValue(toSecureImage("oops"))
    })

    callScript(a.output, result => {
      tralala.property("Mombasa")
    })

    a.output.message("Message").one(cMessage => {
      sqlMap(map => {
        map.setQuery("aaap")
        map.setDatasource("sportlink")
        map.withResultSet(f => {
        	val newMsg = cMessage.addMessage
        	newMsg.addProperty("Name").setValue(f.getColumnValue()).setDescription("Booom").setDirection("in")
          f.getColumnValue("a")

        })

      })
    })
  }

} 