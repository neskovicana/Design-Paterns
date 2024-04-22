package main;

public class AllLowerCase extends Command {
	
	public AllLowerCase() {
	}

	@Override
	public String execute(String s) {
		String result = s.toLowerCase();
		System.out.println("All lower case result: " + result);
		return result;
	}

}
