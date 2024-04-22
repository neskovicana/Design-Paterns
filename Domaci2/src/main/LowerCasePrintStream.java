package main;

import java.io.FileWriter;
import java.io.IOException;

public class LowerCasePrintStream implements PrintStream {
	
	@Override
	public void println(String s) {
		AllLowerCase lc = new AllLowerCase();
		String result = lc.execute(s);
		try {
			FileWriter myWriter = new FileWriter("lowercase_output.txt");
			myWriter.write(result);
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
