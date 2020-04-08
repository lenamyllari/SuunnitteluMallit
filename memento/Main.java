package memento;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Riddler riddler = new Riddler();
		Player player1 = new Player(1, riddler);
		Player player2 = new Player(2, riddler);
		Player player3 = new Player(3, riddler);
		Player player4 = new Player(4, riddler);
		Player player5 = new Player(5, riddler);
		List<Player> players = new ArrayList();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players.add(player5);
		for(Player p : players) {
			p.joinGame();
		}
		for(Player p : players) {
			System.out.println("\nPlayer number " + p.getId() + " guessing:");
			p.guess();
		}
	}

}
