package oracle.tutorial.chapter2test;

import static org.junit.Assert.*;

import java.io.IOException;

import oracle.tutorial.chapter2.ByteStreams;

import org.junit.Test;

public class ByteStreamsTest {

	@Test
	public void testGetCountOfLetter() {
		ByteStreams byteStreams = new ByteStreams("intext.txt", "outtext.txt");
		int counter=0;
		try {
			 counter = byteStreams.getCountOfLetter(104);
			 // 104 is letter h
			System.out.println(counter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(counter==3);
	}

}
