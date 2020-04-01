package templateMethod;

public class Card {
	private final int rank;
    private final int suit;
    public static final String[] RANKS = {
             "Ace", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

        public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit] +"\n";
    }
    public int compareTo(Card that) {

        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }
    
    public boolean compareSuits(Card that) {
        if (this.suit < that.suit) {
            return false;
        }
        return true; 
    }
    
    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }
}
