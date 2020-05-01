package commandState;

public class GoUpDownCommand implements Command{

	private Screen screen;
	
	public GoUpDownCommand(Screen screen) { 
		this.screen = screen; 
		}
	
	@Override
	public void execute() {
		screen.getState().shangeState(screen);
		
	}

}
