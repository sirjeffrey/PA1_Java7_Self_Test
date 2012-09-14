package oracle.tutorial.chapter2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleText {
	public int getWordCount()throws IOException{
		int counter=0;
		BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("myInFile.txt"));
            outputStream = new PrintWriter(new FileWriter("myOutFile.txt"));

            String line;
            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
                String [] stringArray = line.split(" ");
                counter+=stringArray.length;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
		return counter;
	}
}
