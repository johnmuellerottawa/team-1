/*
 * DOSBox, Scrum.org, Professional Scrum Developer Training
 * Authors: Rainer Grau, Daniel Tobler, Zuehlke Technology Group
 * Copyright (c) 2013 All Right Reserved
 */ 

package command.library;

import interfaces.IDrive;
import interfaces.IOutputter;
import command.framework.Command;

/**Command to exit.
 */
class CmdExit extends Command {
	
	protected CmdExit(String name, IDrive drive) {
		super(name, drive);
	}

	@Override
	public boolean checkNumberOfParameters(int numberOfParametersEntered) {
		return (numberOfParametersEntered == 0);
	}
		
	@Override
    public void execute(IOutputter outputter) {
		// do nothing by intention
	}
}
