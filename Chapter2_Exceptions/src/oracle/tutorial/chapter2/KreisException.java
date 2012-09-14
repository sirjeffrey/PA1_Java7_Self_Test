package oracle.tutorial.chapter2;

public class KreisException extends ArithmeticException {
	private double zahl;
	public KreisException(double zahl){
		
		this.zahl = zahl;
	}
	
	public String getMessage() {
		return "Die Zahl \""+this.zahl+"\" ist nicht erlaubt";
		
	}
}
