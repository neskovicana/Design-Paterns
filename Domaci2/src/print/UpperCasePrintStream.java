package print;

import java.io.FileWriter;
import java.io.IOException;

public class UpperCasePrintStream implements PrintStream {
	
	public UpperCasePrintStream() {
	}

	@Override
	public void println(String s) {
		String result = s.toUpperCase();
		try {
			FileWriter myWriter = new FileWriter("uppercase_output.txt");
			myWriter.write(result);
			myWriter.close();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


