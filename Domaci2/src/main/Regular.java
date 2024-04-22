package main;

public class Regular extends Command {

	@Override
	public String execute(String s) {
		System.out.println("All upper case result: " + s);
		return s;
	}

}
