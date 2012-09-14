package oracle.tutorial.chapter3test;

import static org.junit.Assert.*;

import oracle.tutorial.chapter3.Staat;
import oracle.tutorial.chapter3.StaatenQuiz;

import org.junit.Test;

public class StaatenQuizTest {

	@Test
	public void testSortStaatenListe() {
//		fail("Not yet implemented");
		
		Staat BRD = new Staat("Germany", "Berlin", 80000000);
		Staat FRA = new Staat("France", "Paris", 70000000);
		Staat SLO = new Staat("Slovenia", "Ljubljana", 4000000);
		Staat ITA = new Staat("Italy", "Rom", 65000000);
		Staat AUT = new Staat("Austria", "Wien", 9000000);
		Staat USA = new Staat("USA", "Washington", 350000000);
		StaatenQuiz quiz = new StaatenQuiz();
		quiz.addStaatToList(ITA);	
		quiz.addStaatToList(USA);
		quiz.addStaatToList(SLO);
		quiz.addStaatToList(AUT);
		quiz.addStaatToList(BRD);
		quiz.sortStaatenListe();
		assertTrue(quiz.getStaatenListe().get(0).getName().equals("Austria"));
	}

}
