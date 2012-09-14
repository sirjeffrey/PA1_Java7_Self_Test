package oracle.tutorial.chapter3;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staat AUT = new Staat("Austria", "Wien", 9000000);
		Staat BRD = new Staat("Germany", "Berlin", 80000000);
		Staat FRA = new Staat("France", "Paris", 70000000);
		Staat SLO = new Staat("Slovenia", "Ljubljana", 4000000);
		Staat ITA = new Staat("Italy", "Rom", 65000000);
		Staat USA = new Staat("USA", "Washington", 350000000);
		StaatenQuiz quiz = new StaatenQuiz();
		quiz.addStaatToList(ITA);
		quiz.addStaatToList(AUT);
		quiz.addStaatToList(USA);
		quiz.addStaatToList(SLO);
		quiz.addStaatToList(BRD);
		quiz.showStaatenListe();
		quiz.sortStaatenListe();
		System.out.println("Liste nach dem Sortieren");
		quiz.showStaatenListe();
		

	}

}
