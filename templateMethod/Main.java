package templateMethod;

public class Main {

	public static void main(String[] args) {
		Game drinker = new Drinker();
		drinker.initializeGame();
		drinker.makePlay(2);
		drinker.printWinner();
	}

}
