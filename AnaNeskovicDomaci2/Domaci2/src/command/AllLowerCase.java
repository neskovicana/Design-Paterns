package command;

import print.LowerCasePrintStream;

public class AllLowerCase extends Command {
	
	public AllLowerCase() {
	}

	@Override
	public void execute(String s) {
		LowerCasePrintStream lcps = new LowerCasePrintStream();
		lcps.println(s);
	}

}
