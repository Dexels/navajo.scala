package com.dexels.navajo.scala.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dexels.navajo.document.Navajo;
import com.dexels.navajo.document.NavajoFactory;
import com.dexels.navajo.document.types.Binary;
import com.dexels.navajo.mapping.CompiledScript;

public class TestFunctionScript extends BaseTest {

	@Test
	public void test() throws Exception {
		
		Navajo output = testCompiled("com.dexels.navajo.scala.FunctionScript", NavajoFactory.getInstance().createNavajo());
		output.write(System.err);
		Binary b = (Binary) output.getProperty("Simple/Binary").getTypedValue();
		assertTrue(b.getLength()>10);
	}

//	protected Navajo testCompiled(CompiledScript cs, Navajo input, String user, String password, String service) throws Exception {

}
