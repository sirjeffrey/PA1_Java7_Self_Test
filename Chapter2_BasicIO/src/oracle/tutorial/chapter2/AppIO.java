package oracle.tutorial.chapter2;

import java.io.IOException;

public class AppIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ByteStreams byteStreams = new ByteStreams("intext.txt", "outtext.txt");
		int counter=0;
		try {
			 counter = byteStreams.getCountOfLetter(104);
			System.out.println(counter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleText simpleText = new SimpleText();
		try {
			System.out.println(simpleText.getWordCount());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
