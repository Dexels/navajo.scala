package com.dexels.navajo.scala

import com.dexels.navajo.adapter.SQLMap
import com.dexels.navajo.adapter.sqlmap.ResultSetMap

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
class SQL extends SQLMap {

  def withResultSet(f: ResultSetMap => Unit) {
     val map = super.getResultSet()
     for(  x <- map ){
    	 f(x);
     }
  }
  // methods:
  def addParameter(value: Any) {
    super.setParameter(value);
  }

  def doUpdate() {
    super.setDoUpdate(true);
  }
  def rollback() {
    super.setKill(true);
  }
  
  

}