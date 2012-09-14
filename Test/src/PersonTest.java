import static org.junit.Assert.*;

import org.junit.Test;


public class PersonTest {

	@Test
	public void test() {
	//	fail("Not yet implemented");
		Person p = new Person("Hallo");
		assertTrue("Falsche Person", p.getName().equals("Hallo"));
	}

}
