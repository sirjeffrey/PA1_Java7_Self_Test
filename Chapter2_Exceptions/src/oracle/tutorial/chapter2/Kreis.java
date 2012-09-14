package oracle.tutorial.chapter2;

public class Kreis {
	private final double PI = Math.PI; 
	private double radius;
	public Kreis(String radius) throws NumberFormatException, KreisException{
		super();
		this.radius = Double.parseDouble(radius);

			if(this.radius == 0){
				throw new KreisException(this.radius);
			}
		
	}
	public double getFalaeche(){
		return PI*radius*radius;
	}
	public double getUmfang(){
		return 2*PI*radius;
	}
	@Override
	public String toString() {
		return "Kreis [radius=" + radius + "]";
	}
	
}
