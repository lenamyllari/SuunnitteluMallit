package templateMethod;

import java.util.ArrayList;

public class Drinker extends Game {
	CardDeck deck;
	ArrayList<Card> player1;
	ArrayList<Card> player2;
	long startTime;

	@Override
	void initializeGame() {
		deck = new CardDeck();
		player1 = new ArrayList<Card>();
		player2 = new ArrayList<Card>();
		for(int i = 0; i < deck.getSize(); i+=2) {
			player1.add(deck.getCards().get(i));
			player2.add(deck.getCards().get(i+1));
		}
	}

	@Override
	void makePlay(int player) {
		startTime = System.currentTimeMillis();
		int i = 0;
		int j = 0;
		while(!endOfGame()) {
			try {
				player1.get(i);
			}
			catch(IndexOutOfBoundsException e) {
				i=0;
			}
			try {
				player2.get(j);
			}
			catch(IndexOutOfBoundsException e) {	
				j=0;
			}
			System.out.println("Players' cards:");
			System.out.println("1: " + player1.get(i));
			System.out.println("2: " + player2.get(j));
			if(player1.get(i).compareTo(player2.get(j))==1){
				player1.add(player2.get(j));
				player2.remove(j);				
			}
			else if(player1.get(i).compareTo(player2.get(j))==-1){
				player2.add(player1.get(i));
				player1.remove(i);
			}
			else {
				if(player1.get(i).compareSuits(player2.get(j))) {
					player1.add(player2.get(j));
					player2.remove(j);
				}
				else {
					player2.add(player1.get(i));
					player1.remove(i);
				}
			}
			i++;
			j++;
		}

	}

	@Override
	boolean endOfGame() {
		return player1.size()<=0 || player2.size()<=0 || System.currentTimeMillis()-startTime > 60000;
	}

	@Override
	void printWinner() {
		System.out.println("\n\n1 has " + player1.size() + " cards left");
		System.out.println("2 has " + player2.size() + " cards left");
		if(player2.size()==0) {
			System.out.println("Player1 is the winner");
		}
		else if (player1.size()==0){
			System.out.println("Player2 is the winner");
		}
		else {
			System.out.println("An even game!");
		}
	}

}
