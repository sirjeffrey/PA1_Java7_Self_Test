package oracle.tutorial.chapter3test;

import static org.junit.Assert.*;


import oracle.tutorial.chapter3.Staat;
import oracle.tutorial.chapter3.StaatenQuizMap;


import org.junit.Test;


public class StaatenQuizMapTest {



	
	@Test
	public void testAddStaatToMap() {

		StaatenQuizMap quiz = new StaatenQuizMap();
		Staat at = new Staat("Austria", "Wien", 9000000);
		
		Staat de = new Staat("Germany", "Berlin", 80000000);
		Staat fr = new Staat("France", "Paris", 70000000);
		
		quiz.addStaatToMap("AUT", at);
		assertTrue(quiz.getStaatenMap().size()==1);
		quiz.addStaatToMap("BRD", de);
		quiz.addStaatToMap("FRA", fr);
		assertTrue(quiz.getStaatenMap().size()==3);
		
	}

	@Test
	public void testGetStaat() {
		StaatenQuizMap quiz = new StaatenQuizMap();
		Staat at = new Staat("Austria", "Wien", 9000000);
		Staat de = new Staat("Germany", "Berlin", 80000000);
		Staat fr = new Staat("France", "Paris", 70000000);
		
		quiz.addStaatToMap("AUT", at);
		quiz.addStaatToMap("BRD", de);
		quiz.addStaatToMap("FRA", fr);
		
		assertTrue(quiz.getStaat("BRD").getEinwohner()==80000000);
	}

	@Test
	public void testRemovStaat() {
		StaatenQuizMap quiz = new StaatenQuizMap();
		Staat at = new Staat("Austria", "Wien", 9000000);
		Staat de = new Staat("Germany", "Berlin", 80000000);
		Staat fr = new Staat("France", "Paris", 70000000);
		
		quiz.addStaatToMap("AUT", at);
		quiz.addStaatToMap("BRD", de);
		quiz.addStaatToMap("FRA", fr);
		quiz.removStaat("BRD");
	//	assertTrue(quiz.getStaatenMap().size()==2);
		assertNull(quiz.getStaat("BRD"));
		
	}

}
