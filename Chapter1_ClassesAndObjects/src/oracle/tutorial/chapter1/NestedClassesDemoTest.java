package oracle.tutorial.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NestedClassesDemoTest {

	@Test
	public void testNestedClassesDemo() {
//		fail("Not yet implemented");
		NestedClassesDemo nk = new NestedClassesDemo("myClass");
		assertTrue(nk.getName().equals("myClass"));
	}

	public void testStaicNestedClassesDemo() {
//		fail("Not yet implemented");
	
		assertTrue(new NestedClassesDemo.StaticNesstedClass().getStaicAttribut().equals("Hallo from the out class"));
	}

}
