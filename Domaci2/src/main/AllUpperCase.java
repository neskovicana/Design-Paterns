package main;

public class AllUpperCase extends Command {
	
	public AllUpperCase() {}

	@Override
	public String execute(String s) {
		String result = s.toUpperCase();
		System.out.println("All upper case result: " + result);
		return result;
	}

}
