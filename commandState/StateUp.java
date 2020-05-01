package commandState;

public class StateUp implements ScreenState{

	@Override
	public void shangeState(Screen screen) {
		screen.setState(new StateDown());
		
	}

	@Override
	public String toString() {
		String up = "The screen is rolled up.\n _____________\n/____________/";
		return up;
	}
}
