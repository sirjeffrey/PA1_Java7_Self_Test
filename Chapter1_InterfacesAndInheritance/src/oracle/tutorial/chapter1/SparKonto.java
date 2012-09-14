package oracle.tutorial.chapter1;

public class SparKonto extends Konto {
	private double zinssatz;

	public SparKonto(int kontonummer, double zinssatz) {
		super(kontonummer);
		this.zinssatz = zinssatz;
	}

	public double getZinssatz() {
		return zinssatz;
	}

	public void setZinssatz(double zinssatz) {
		this.zinssatz = zinssatz;
	}
	public void verzinsen(){
		saldo+=(saldo*zinssatz)/100;
	}
	public void auszug(){
		
		System.out.println("Kontonummer: "+kontonummer+" Saldo: "+saldo+" EUR"+" Zinssatz "+zinssatz+"%");
	}
}
