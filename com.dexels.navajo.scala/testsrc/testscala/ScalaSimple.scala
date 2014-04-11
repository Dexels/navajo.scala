package testscala

import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.scala.document.NavajoRuntime
import com.dexels.navajo.scala.Adapters
import com.dexels.navajo.scala.Functions

class TestScalaSimple extends ScalaCompiledScript with Adapters with Functions {
   
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