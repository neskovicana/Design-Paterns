package command;

import print.RegularPrintStream;

public class Regular extends Command {
	
	public Regular() {}

	@Override
	public void execute(String s) {
		RegularPrintStream rps = new RegularPrintStream();
		rps.println(s);
	}

}
