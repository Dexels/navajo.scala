package testscala;
import com.dexels.navajo.mapping.*;
import com.dexels.navajo.script.api.*;

public class TestPlayerEntityFactory extends CompiledScriptFactory {
	protected String getScriptName() {
		return "testscala.ScalaTestPlayerEntity";
	}
public CompiledScript getCompiledScript() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	Class<? extends CompiledScript> c;
	c = (Class<? extends CompiledScript>) Class.forName(getScriptName());
	CompiledScript instance = c.newInstance();
	super.initialize(instance);
	return instance;
}


}
