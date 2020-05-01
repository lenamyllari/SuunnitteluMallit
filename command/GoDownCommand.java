package command;

public class GoDownCommand implements Command { 
	
	private Screen screen;
	
	public GoDownCommand(Screen screen) { 
		this.screen = screen; 
		}

	@Override 
	public void execute() { 
		screen.goDown(); 
		}
}
