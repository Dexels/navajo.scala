package com.dexels.navajo.scala;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import testscala.ScalaSimpleFactory;

import com.dexels.navajo.document.Navajo;
import com.dexels.navajo.document.NavajoFactory;
import com.dexels.navajo.mapping.CompiledScript;
import com.dexels.navajo.script.api.Access;

public class TestTotal extends BaseTest {

	@Test
	public void test() throws Exception {
		ScalaSimpleFactory tss = new ScalaSimpleFactory();
		Navajo output = testFactory(tss,"testscala.ScalaSimple", NavajoFactory.getInstance().createNavajo(),"testuser","testpassword","testscala.ScalaSimple");
		output.write(System.err);
		assertNotNull(output.getMessage("Simple"));
	}

}
