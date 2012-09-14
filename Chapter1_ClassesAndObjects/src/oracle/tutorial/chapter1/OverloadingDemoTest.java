package oracle.tutorial.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class OverloadingDemoTest {

	@Test
	public void testPow(){
//		fail("Not yet implemented");
		
		assertEquals(OverloadingDemo.pow(10.0), 100.0, 0.001);
	}

	@Test
	public void testRaisedTo() {
//		fail("Not yet implemented");
		assertEquals(OverloadingDemo.pow(10.0, 3), 1000.0, 0.001);
	}

}
