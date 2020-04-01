package templateMethod;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

	ArrayList<Card> cards = new ArrayList<Card>();
    public static final String[] RANKS = {
           "Ace", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

        public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"};
	
	public CardDeck() {
		for (int i = 0; i<SUITS.length; i++) {
            for(int j=0; j<RANKS.length; j++){
                this.cards.add(new Card(j, i));
            }
        }
        //shuffle the deck when its created
       Collections.shuffle(this.cards);

	}
	
	ArrayList<Card> getCards() {
		return cards;
	}
	
	public int getSize() {
		return cards.size();
	}
}
