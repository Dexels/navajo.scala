package testscala

import navajo.navajoadapters.NavajoAdapters
import com.dexels.navajo.scala._
import com.dexels.navajo.scala.document.NavajoRuntime


class TestScalaSimple extends ScalaCompiledScript with NavajoAdapters {
   
  override def run(a: NavajoRuntime) {

//    addValidation(rt=>{
//    })
	val sport = a.output.addArrayMessage("Sport")
	sqlquery(sport,a=>{
	  a.datasource("default")
	  a.query("SELECT DISTINCT sporttype FROM sport")
	  a.withResultSet(result=>{
	    sport.addMessage(m=>{
          m.addProperty("Sport").value(result.value("sporttype"))
        })
	  })
	})
	
	
  }
}