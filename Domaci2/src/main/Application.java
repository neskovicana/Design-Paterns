package main;

public class Application {
	

	public static void main(String[] args) {
		AllUpperCase allUpperCase = new AllUpperCase();
		AllLowerCase allLowerCase = new AllLowerCase();
		Regular regular = new Regular();
		
		UpperCasePrintStream upperCasePrinter = new UpperCasePrintStream();
		LowerCasePrintStream lowerCasePrinter = new LowerCasePrintStream();
		RegularPrintStream regularPrinter = new RegularPrintStream();
		
		String[] inputStrings = {
	            "Hello World",
	            "Java is Fun",
	            "stop"
	        };
		
		for (String input : inputStrings) {
            if (input.equals("STOP")) {
                break;
            }

            if (Character.isUpperCase(input.charAt(0))) {
                allUpperCase.execute(input);
                upperCasePrinter.println(input);
            } else if (Character.isLowerCase(input.charAt(0))) {
                String result = allLowerCase.execute(input);
                lowerCasePrinter.println(result);
            } else {
                String result = regular.execute(input);
                regularPrinter.println(result);
            }
        }

        System.out.println("Program execution completed. Check output files: uppercase_output.txt, lowercase_output.txt, regular_output.txt");
	}

}
