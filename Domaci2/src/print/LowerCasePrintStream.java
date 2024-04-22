package print;

import java.io.FileWriter;
import java.io.IOException;

public class LowerCasePrintStream implements PrintStream {
	
	public LowerCasePrintStream() {
	}

	@Override
	public void println(String s) {
		String result = s.toLowerCase();
		try {
			FileWriter myWriter = new FileWriter("lowercase_output.txt");
			myWriter.write(result);
			myWriter.close();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
