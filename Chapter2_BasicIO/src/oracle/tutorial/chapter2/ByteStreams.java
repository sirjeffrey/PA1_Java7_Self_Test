package oracle.tutorial.chapter2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	private String inFile;
	private String outFile;
	
	public ByteStreams(String in, String out){
		this.inFile = in;
		this.outFile = out;
	}
	public int getCountOfLetter(int letter) throws IOException{
		int counter = 0;
		FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(this.inFile);
            out = new FileOutputStream(this.outFile);
            int c;

            while ((c = in.read()) != -1) {
               
                if(c==letter){
                	 out.write(c);
                	 counter++;
                }
                	
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
		return counter;
	}

}
