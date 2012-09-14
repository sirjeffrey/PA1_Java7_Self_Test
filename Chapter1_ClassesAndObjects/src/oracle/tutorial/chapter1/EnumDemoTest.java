package oracle.tutorial.chapter1;

import static org.junit.Assert.*;

import java.util.Currency;

import org.junit.Test;

public class EnumDemoTest {

	@Test
	public void testGetCurrency() {
//		fail("Not yet implemented");
		
		assertTrue(new EnumDemo(COUNTRY.SWEDEN).getCurrency().equals(Currency.getInstance("SEK")));
	}

}
