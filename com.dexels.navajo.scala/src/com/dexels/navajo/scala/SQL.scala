package com.dexels.navajo.scala

import com.dexels.navajo.adapter.sqlmap.ResultSetMap
import com.dexels.navajo.script.api.Access
import com.dexels.navajo.script.api.Mappable

/*	<map>
		<tagname>sqlquery</tagname>
		<object>com.dexels.navajo.adapter.SQLMap</object>
		<values>
			<value name="query" type="string" required="false" direction="in" />
			<value name="update" type="string" required="false" direction="in" />
			<value name="binaryQuery" type="binary" required="false" direction="in" />
			<value name="binaryUpdate" type="binary" required="false" direction="in" />
			<value name="debug" type="boolean" required="false" direction="in" />
			<value name="transactionContext" type="integer" required="false" direction="in" />
			<value name="datasource" type="string" required="false" direction="in" />
			<value name="username" type="string" required="false" direction="in" />
			<value name="parameter" type="any" required="false" direction="in" cardinality="+" />
			<value name="resultSet" map="resultrow []" required="false" direction="out" />
		</values>
		<methods>
			<method name="addParameter">
				<param name="value" field="parameter" type="any" required="true" />
			</method>
			<method name="doUpdate">
				<param name="value" field="doUpdate" type="boolean" required="automatic" value="true" />
			</method>
			<method name="rollback">
				<param name="value" field="kill" type="boolean" required="automatic" value="true" />
			</method>
		</methods>
	</map>
*/
class SQL() extends Adapter {

  val instance: com.dexels.navajo.adapter.SQLMap = new com.dexels.navajo.adapter.SQLMap
  
  def withResultSet(f: ResultSetMap => Unit) = {
    val map = instance.getResultSet()
     for(  x <- map ){
    	 f(x);
     }
  }
  // methods: 	
  def addParameter(value: Any) = {
    instance.setParameter(value)
  }

  def doUpdate() = {
    instance.setDoUpdate(true)
  }
  def rollback() = {
    instance.setKill(true)
  }

  // values
  def transactionContext: Int = {
    instance.transactionContext
  }

  def datasource(s: String): Unit = {
    instance.setDatasource(s)
  }
  
 def query(s: String): Unit = {
    instance.setQuery(s)
  }
}

//class Location(override val xc: Int, override val yc: Int,
//   val zc :Int) extends Point(xc, yc){

class Adapter(instance: Any) {

  def load(access: Access) {
    if(instance.isInstanceOf[Mappable]) {
      // better to do this compiletime in the child instance
     instance.asInstanceOf[Mappable].load(access)
    }
  }

    def store() {
    if(instance.isInstanceOf[Mappable]) {
      // better to do this compiletime in the child instance
     instance.asInstanceOf[Mappable].store()
    }
  }

      def kill() {
    if(instance.isInstanceOf[Mappable]) {
      // better to do this compiletime in the child instance
     instance.asInstanceOf[Mappable].kill()
    }
  }

}