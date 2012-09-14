package oracle.tutorial.chapter2;

import java.util.ArrayList;

public class ProductList {
	private ArrayList<Product> productList;
	public ProductList(){
		this.productList = new ArrayList<Product>();
	}
	public void addProduct(Product product){
		try{
			this.productList.add(product);
		}catch (NullPointerException e){
			System.out.println(e.getStackTrace());
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getStackTrace());
		}
		finally{
			System.out.println("Programm beenden!!");
		}
	}
	public double getAveragePrice() throws ArithmeticException{
		double sum=0.0;
		if( this.productList.size()==0) throw new ArithmeticException("Liste ist leer!!!");
		for(Product product: productList){
			sum+=product.getPrice();
		}
			return sum/this.productList.size();		
	}

}
