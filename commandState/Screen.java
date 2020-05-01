package commandState;

public class Screen {
	
	private ScreenState state;
	
	public Screen(ScreenState state) {
		this.state = state;
	}
	
	public void setState(ScreenState state) {
		this.state = state;
	}
	
	public ScreenState getState() {
		return this.state;
	}
	
}
