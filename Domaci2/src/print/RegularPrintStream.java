package print;

import java.io.FileWriter;
import java.io.IOException;

public class RegularPrintStream implements PrintStream {
	
	public RegularPrintStream() {
	}

	@Override
	public void println(String s) {
		String result = s;
		try {
			FileWriter myWriter = new FileWriter("regular_output.txt");
			myWriter.write(result);
			myWriter.close();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
