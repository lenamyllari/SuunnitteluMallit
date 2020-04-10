package memento;

public class Main {

	public static void main(String[] args) {
		Riddler riddler = new Riddler();
		Player player1 = new Player(1, riddler);
		Player player2 = new Player(2, riddler);
		Player player3 = new Player(3, riddler);
		Player player4 = new Player(4, riddler);
		Player player5 = new Player(5, riddler);
		
		player1.run();
		player2.run();
		player3.run();
		player4.run();
		player5.run();
	}

}
