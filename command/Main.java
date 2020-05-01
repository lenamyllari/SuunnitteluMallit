package command;

public class Main {

	public static void main(String[] args) {
		Screen screen = new Screen(); 
		Command goUp = new RollUpCommand(screen); 
		Command goDown = new GoDownCommand(screen); 
		WallButton button1 = new WallButton(goUp); 
		WallButton button2 = new WallButton(goDown);
		button1.push(); 
		button2.push();
	}

}
