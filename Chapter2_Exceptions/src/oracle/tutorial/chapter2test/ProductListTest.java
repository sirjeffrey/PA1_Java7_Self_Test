package oracle.tutorial.chapter2test;

import oracle.tutorial.chapter2.Product;
import oracle.tutorial.chapter2.ProductList;

import org.junit.Test;

public class ProductListTest {

	@Test(expected = NullPointerException.class)
	public void testAddProduct() {
		ProductList myProductList1 = new ProductList();
		Product p1 = null;
		myProductList1.addProduct(p1);
		System.out.println(p1.toString());
		
	}

	@Test(expected = Exception.class)
	public void testGetAveragePrice() {
		ProductList myProductList2 = new ProductList();
		double average; 
		average = myProductList2.getAveragePrice();
		System.out.println("AverageProductPrice:   "+average);
		
	}

}
