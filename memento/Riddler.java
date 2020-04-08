package memento;

import java.util.Random;

//originator
public class Riddler {
	
	public Riddler() {
		
	}
	
	public Object getNumber(Player player) {		
		return new Memento(player.getId(), new Random().nextInt(20));		
	}
	
	public boolean guessNumber(Object obj, int guess) {
		Memento memento = (Memento) obj;
		if (memento.number == guess) {
			System.out.println("You've guessed. the right number was " + memento.number);
			return true;
		}
		System.out.println("Wrong number!");
		return false;
	}
	
	private class Memento{
		private int player; 
		private int number;
		
		public Memento(int player, int number){ 
			this.player=player; 
			this.number=number; 
		}
	}
}

