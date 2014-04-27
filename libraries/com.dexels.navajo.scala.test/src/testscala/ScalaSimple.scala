package testscala

import com.dexels.navajo.scala._
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.adapters.scala.api.AdaptersComponent


class TestScalaSimple extends ScalaCompiledScript with AdaptersComponent {
   
  override def run(a: NavajoRuntime) {

//    addValidation(rt=>{
//    })
	val sport = a.output.addArrayMessage("Sport")
	sqlquery(sport,a=>{
	  a.datasource("default")
	  a.query("SELECT DISTINCT sporttype FROM sport")
	  a.withEachResultSet(result=>{
	    sport.addMessage(m=>{
          m.addProperty("Sport").value(result.value("sporttype"))
        })
	  })
	})
	
	
  }
}