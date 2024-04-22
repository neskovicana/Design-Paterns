package main;

import java.io.FileWriter;
import java.io.IOException;

public class UpperCasePrintStream implements PrintStream {

	private AllUpperCase upperCase;
	
	@Override
	public void println(String s) {
		String result = upperCase.execute(s);
		try {
			FileWriter myWriter = new FileWriter("uppercase_output.txt");
			myWriter.write(result);
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
