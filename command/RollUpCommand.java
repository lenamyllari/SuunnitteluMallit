package command;

public class RollUpCommand implements Command { 
	
	private Screen screen;
	
	public RollUpCommand(Screen screen) { 
		this.screen = screen; 
		}

	@Override 
	public void execute() { 
		screen.goUp(); 
		}
}
