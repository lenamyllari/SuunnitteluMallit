package memento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//caretaker
public class Player {
	private Riddler riddler;
	private int id;
	private Object obj;
	List<Integer> numbers;
	
	public Player(int id, Riddler riddler) {
		this.id = id;
		this.riddler = riddler;
		this.numbers = new ArrayList();
	}
	
	public void joinGame() {
		this.obj = riddler.getNumber(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void guess() {
		int guess = new Random().nextInt(20);
		//System.out.println("I'm guessing. My guess is " + guess);
		if(!this.numbers.contains(guess)) {
			this.numbers.add(guess);
			if(riddler.guessNumber(obj, guess)) {
				System.out.println("I've guessed. My guess was " + guess);
			} else {
				System.out.println("I've not guessed. My guess was " + guess);
				guess();
			}
		}
		else {
			guess();
		}
	}
}
