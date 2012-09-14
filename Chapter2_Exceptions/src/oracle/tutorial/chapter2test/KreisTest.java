package oracle.tutorial.chapter2test;

import oracle.tutorial.chapter2.Kreis;
import oracle.tutorial.chapter2.KreisException;

import org.junit.Test;

public class KreisTest {

	@Test(expected = KreisException.class)
	public void testKreis1() {
		Kreis k1 = new Kreis("0");
		System.out.println(k1);
		
	}
	@Test(expected = NumberFormatException.class)
	public void testKreis2() {
		Kreis k2 = new Kreis("uzu");
		System.out.println(k2);
		
	}


}
