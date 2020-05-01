package commandState;

public class StateDown implements ScreenState{

	@Override
	public void shangeState(Screen screen) {
		screen.setState(new StateUp());
	}
	
	@Override
	public String toString() {
		String down = 	"The screen is open.\n" + 
						" _____________\n"+
						"|             |\n"+
						"|             |\n"+
						"|             |\n"+
						"|_____________|";
		return down;
	}

}
