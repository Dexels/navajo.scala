package com.dexels.navajo.scala
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.document.Navajo
import com.dexels.navajo.adapter.SQLMap
import com.dexels.navajo.scala.document.NavajoFactory
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.document.NavajoMessage
import com.dexels.navajo.functions.ToSecureImage
import com.dexels.navajo.function.scala.api.FunctionComponent
import com.dexels.navajo.adapters.scala.api.AdaptersComponent

class Script extends ScalaCompiledScript with FunctionComponent with AdaptersComponent {

  override def run() {
     ToSecureImage("aap");
    val tralala = input.message("Tra")

    
    tralala.each(msg => {
      msg.property("MyProp").value(ToSecureImage("oops"))
    })

    callScript(script = "test/abc", input =  output, withResult =  result => {
      tralala.property("Mombasa")
    })
    output.message("Message").one(cMessage => {
      sqlquery(cMessage, map=> {
        map.query("aaap")
        map.datasource("sportlink")
        map.withEachResultSet(f => {
        	val newMsg = cMessage.addMessage("aap")
        	newMsg.addProperty("Name").value(f.columnValue).description("Booom").direction("in")
          f.value("a")

        })

      })
    })
  }

} 