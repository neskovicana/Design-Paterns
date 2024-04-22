package command;

public abstract class Command {
	
	public Command() {
	}

	public abstract void execute(String s);

	public static Command get(String s) {
		if (Character.isUpperCase(s.charAt(0)))
			return new AllUpperCase();
		else if (Character.isLowerCase(s.charAt(0)))
			return new AllLowerCase();
		else 
			return new Regular();		
	}
	
}
