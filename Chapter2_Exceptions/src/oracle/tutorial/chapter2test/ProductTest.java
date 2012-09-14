package oracle.tutorial.chapter2test;

import oracle.tutorial.chapter2.KreisException;
import oracle.tutorial.chapter2.Product;

import org.junit.Test;

public class ProductTest {

	@Test(expected = IllegalArgumentException.class)
	public void testProduct1() {
		Product product1 = new Product("", "1.5");
		System.out.println(product1);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testProduct2() {
		Product product2 = new Product("Reis", "Hallo");
		System.out.println(product2);
		
	}

	@Test(expected = ArithmeticException.class)
	public void testSetPrice() {
		Product product3 = new Product("Weizen", "2.1");
		product3.setPrice(-2.3);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGetgewichtsKategorie() {
		Product product4 = new Product("Oell", "1.3");
		System.out.println(product4.getgewichtsKategorie(3));
	}

}
