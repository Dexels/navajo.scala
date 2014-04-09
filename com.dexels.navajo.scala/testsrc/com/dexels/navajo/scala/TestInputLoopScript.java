package com.dexels.navajo.scala;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.dexels.navajo.document.Navajo;
import com.dexels.navajo.document.NavajoFactory;
import com.dexels.navajo.document.types.Binary;

public class TestInputLoopScript extends BaseTest {

	private Navajo input;

	@Before
	public void setup() {
		input = getResource("input.xml");
	}
	@Test
	public void test() throws Exception {
		Navajo output = testCompiled("com.dexels.navajo.scala.InputLoopScript", input);
		output.write(System.err);
	}

	@Test
	public void testJoin() throws Exception {
		Navajo output = testCompiled("com.dexels.navajo.scala.JoinScript", input);
		output.write(System.err);
	}

}
