package oracle.tutorial.chapter1;

public class Konto {
	static int zaehler = 0;
	protected int kontonummer;
	protected double saldo;
	
	public Konto(int kontonummer){
		zaehler = zaehler + 1;
		this.kontonummer = kontonummer;
		saldo = 0.0;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void einzahlen(double betrag){
		saldo+=betrag;
	}
	
	public void auszahlen(double betrag){
		saldo-=betrag;
	}
	public void auszug(){
		System.out.println("Kontonummer: "+kontonummer+" Saldo: "+saldo+" EUR");
	}
}
