package oracle.tutorial.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testPersonStringStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVorname() {
//		fail("Not yet implemented");
		Person pers = new Person("Haj-Yahya", "Salim", 30);
		assertTrue(pers.getVorname().equals("Salim"));
	}

	@Test
	public void testSetVorname() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAlter() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAlter() {
		fail("Not yet implemented");
	}

}
