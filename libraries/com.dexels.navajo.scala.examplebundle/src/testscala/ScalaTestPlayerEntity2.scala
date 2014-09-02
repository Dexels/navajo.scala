package testscala

import com.dexels.navajo.scala.ScalaCompiledScript
import com.dexels.navajo.adapters.scala.api.AdaptersComponent
import com.sportlink.adapters.scala.api.SportlinkAdaptersComponent
import com.dexels.navajo.function.scala.api.FunctionComponent
import com.dexels.navajo.scala.document.NavajoFactory
import com.dexels.navajo.entity.scala.api._
import java.util.Date

class ScalaTestPlayerEntity2 extends ScalaCompiledScript
     with AdaptersComponent with SportlinkAdaptersComponent with FunctionComponent {
    
    override def run() {
        val clubData  = output.addMessage("ClubData");
    	val in  = inputEntity[Player]
    	val out  = outputEntity[Player];

        out.FirstName("Jan")
        out.LastName("Jansen")
        out.Birthdate(new Date())
        out.Gender("male")
        
    }
}