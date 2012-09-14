package oracle.tutorial.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testCalculateAverageGrads() {
//		fail("Not yet implemented");
		Student student = new Student("Deutsch", "Michael", 38, "SWD", 121212);
		student.addFach(new Fach("Mathematik I", 2));
		student.addFach(new Fach("Mathematik II", 1));
		student.addFach(new Fach("Softwareentwicklung I", 2));
		student.addFach(new Fach("Softwareentwicklung II", 3));
		student.addFach(new Fach("Netzwerktechnik", 1));
		System.out.println(student.calculateAverageGrads());
		assertTrue((double)9/5==student.calculateAverageGrads());
		
	}
	@Test
	public void testAddFach() {
//		fail("Not yet implemented");
		Student student = new Student("Deutsch", "Michael", 38, "SWD", 121212);
		student.addFach(new Fach("Mathematik I", 2));
		student.addFach(new Fach("Mathematik II", 1));
		student.addFach(new Fach("Softwareentwicklung I", 2));
		student.addFach(new Fach("Softwareentwicklung II", 3));
		student.addFach(new Fach("Netzwerktechnik", 1));
		
		assertEquals(student.getFaecherList().get(3).getBezeichnung(), "Softwareentwicklung II");
		
	}
}
