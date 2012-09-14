package oracle.tutorial.chapter2test;

import static org.junit.Assert.*;

import java.io.IOException;

import oracle.tutorial.chapter2.SimpleText;

import org.junit.Test;

public class SimpleTextTest {

	@Test
	public void testGetWordCount() {
		SimpleText simpleText = new SimpleText();
		int counter=0;
		try {
			counter = simpleText.getWordCount();
			System.out.println(counter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(counter==18);
	}
}
