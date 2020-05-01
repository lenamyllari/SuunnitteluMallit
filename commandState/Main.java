package commandState;

public class Main {

	public static void main(String[] args) {
		StateUp upState = new StateUp();
		Screen screen = new Screen(upState); 
		Command goUpDown = new GoUpDownCommand(screen); 
		WallButton button = new WallButton(goUpDown);
		for(int i = 0; i<5; i++) {
			button.push();
			System.out.println(screen.getState());
		}
	}
}
