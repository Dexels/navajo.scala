package com.dexels.navajo.scala
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.document.Navajo
import com.dexels.navajo.adapter.SQLMap
import com.dexels.navajo.scala.document.NavajoFactory
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.document.NavajoMessage
import com.dexels.navajo.functions.ToSecureImage

class Script extends ScalaCompiledScript with Functions with Adapters {

  override def run(a: NavajoRuntime) {
     ToSecureImage("aap");
    val tralala = a.input.message("Tra")

    
    tralala.each(msg => {
      msg.property("MyProp").value(ToSecureImage("oops"))
    })

    callScript(a.output, result => {
      tralala.property("Mombasa")
    })
    a.output.message("Message").one(cMessage => {
      sqlquery(cMessage, map=> {
        map.query("aaap")
        map.datasource("sportlink")
        map.withResultSet(f => {
        	val newMsg = cMessage.addMessage("aap")
        	newMsg.addProperty("Name").value(f.columnValue).description("Booom").direction("in")
          f.value("a")

        })

      })
    })
  }

} 