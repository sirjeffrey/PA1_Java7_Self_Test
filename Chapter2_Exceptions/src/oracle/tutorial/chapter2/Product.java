package oracle.tutorial.chapter2;

public class Product {
	private String name;
	private double price;
	private int []gewichtsKategorie = {2, 5, 10};
	public Product(String name, String price) throws IllegalArgumentException, NumberFormatException{
		if(name==""){
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.price = Double.parseDouble(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price <= 0)
			throw new ArithmeticException();
		this.price = price;
	}
	public int getgewichtsKategorie(int kat) throws ArrayIndexOutOfBoundsException{
		if(kat>= this.gewichtsKategorie.length) throw new ArrayIndexOutOfBoundsException();
		return gewichtsKategorie[kat];
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "EUR je Kg]";
	}
}
