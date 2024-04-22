package main;

import command.Command;

public class Application {
	
	public Application() {
	}

	public static void main(String[] args) {
		String[] inputStrings = { "Hello World", "Java is Fun", "proba test Proba", "1dva3CetiriPet", "STOP" };

		for (String input : inputStrings) {
			if (input.equals("STOP")) {
				break;
			}

			Command c = Command.get(input);
			c.execute(input);

		}
	}

}
