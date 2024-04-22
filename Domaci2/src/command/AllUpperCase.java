package command;

import print.UpperCasePrintStream;

public class AllUpperCase extends Command {
	
	public AllUpperCase() {}

	@Override
	public void execute(String s) {
		UpperCasePrintStream ucps = new UpperCasePrintStream();
		ucps.println(s);
	}

}
