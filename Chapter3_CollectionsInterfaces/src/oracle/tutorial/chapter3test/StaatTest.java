package oracle.tutorial.chapter3test;

import static org.junit.Assert.*;

import oracle.tutorial.chapter3.Staat;

import org.junit.Test;

public class StaatTest {

	@Test
	public void testGetName() {
//		fail("Not yet implemented");
		
		Staat AUT = new Staat("Austria", "Wien", 9000000);
		assertTrue(AUT.getName().equals("Austria"));
	}
	@Test
	public void testGgetEinwohner() {
//		fail("Not yet implemented");
		
		Staat AUT = new Staat("Austria", "Wien", 9000000);
		assertTrue(AUT.getEinwohner()==9000000);
	}
}
