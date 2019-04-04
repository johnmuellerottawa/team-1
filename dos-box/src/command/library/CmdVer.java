package command.library;

import java.util.ArrayList;
import java.util.List;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

public class CmdVer extends Command {
	
	private static final String VERSION = "Version x.x.xxxx";
	private List <String> teamMembers = new ArrayList <String> ();
	private String param;
	private String command = "/w";

	protected CmdVer(String commandName, IDrive drive) {
		super(commandName, drive);
	}
	
	@Override
	protected boolean checkParameterValues(IOutputter outputter) {
		
		if(getParameterCount() > 0) {
			
			for(int i=0 ; i<getParameterCount(); i++)
	        {
	            if (getParameterAt(i).contains(command)) {
	            	
	            	this.teamMembers.add("Bryan");
	            	this.teamMembers.add("Ryan");
	            	this.teamMembers.add("Sebastien");
	            	this.teamMembers.add("Jian");
	            	this.teamMembers.add("Carmelo");
	        		
					return true;
	            }
	            else {
	            	return false;
	            }
	        }
		}
		
		return true;		
	                
	}
	

	@Override
	public void execute(IOutputter outputter) {
		if(getParameterCount() == 0) {
			outputter.printLine(VERSION);
		}
		else {
			outputter.printLine(VERSION + "\n");
			for(String Member:teamMembers) {				
				outputter.printLine(Member);
			}
		}
		
	}

	public static String getVersion() {
		return VERSION;
	}

	public List <String> getTeamMembers() {
		return teamMembers;
	}

}
