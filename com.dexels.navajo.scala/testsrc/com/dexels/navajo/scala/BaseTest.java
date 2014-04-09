package com.dexels.navajo.scala;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import testscala.ScalaSimpleFactory;

import com.dexels.navajo.document.Navajo;
import com.dexels.navajo.document.NavajoFactory;
import com.dexels.navajo.mapping.CompiledScript;
import com.dexels.navajo.script.api.Access;

public class BaseTest {
	
	
	protected Navajo testCompiled(String name, Navajo input) throws Exception {
		CompiledScript cs = (CompiledScript) Class.forName(name).newInstance();
		return testCompiled(cs, input, "testuser", "testpassword", "testservice");
	}
	
	protected Navajo testFactory(ScalaSimpleFactory tss, String scriptName, Navajo input, String user, String password, String service)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, Exception {
		Map<String,String> settings = new HashMap<String,String>();
		settings.put("navajo.scriptName",scriptName);
		tss.activate(settings);
		CompiledScript cs = tss.getCompiledScript();
		return testCompiled(cs, input,user,password,service);
	}
	
	protected Navajo testCompiled(CompiledScript cs, Navajo input, String user, String password, String service) throws Exception {
		Access a = new Access();
		a.setInDoc(input);
		Navajo output = NavajoFactory.getInstance().createNavajo();
		a.setOutputDoc(output);
		a.rpcUser = user;
		a.rpcPwd = password;
		a.rpcName = service;
		cs.setInDoc(input);
		cs.run(a);
		return a.getOutputDoc();
	}

	protected Navajo getResource(String name) {
		InputStream is = getClass().getResourceAsStream(name);
		Navajo result = NavajoFactory.getInstance().createNavajo(is);
		return result;
	}
}
