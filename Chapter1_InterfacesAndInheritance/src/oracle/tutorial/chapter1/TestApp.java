package oracle.tutorial.chapter1;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Konto k1 = new Konto(300);
//		Konto k2 = new Konto(454);
//		Konto k3 = new Konto(30);
//		Konto k4 = new Konto(1300);
//		System.out.println(Konto.zaehler);
//		k1.einzahlen(87);
//		k1.einzahlen(13);
//		k3.einzahlen(807);
//		k3.auszahlen(100);
//		
//		k1.auszug();
//		k2.auszug();
//		k3.auszug();
//		k4.auszug();
//		SparKonto sp = new SparKonto(32, 10);
//		sp.einzahlen(200);
//		sp.verzinsen();
//		sp.auszug();
		
		MovablePoint mp = new MovablePoint(2, 10);
		System.out.println(mp.toString());
		System.out.println(mp);
		mp.moveDown();
		System.out.println(mp);
		mp.moveDown();
		System.out.println(mp);
		mp.moveLeft();
		System.out.println(mp);
		
		
		
	}

}
