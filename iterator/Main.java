package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Iterable list
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 50; i++) {
			numbers.add(i);
		}
		
		//same iterator 
		System.out.println("Same iterator in use");
		Iterator<Integer> sameIterator = numbers.iterator();
		Thread thread1 = new SameIterator(1, sameIterator);
		Thread thread2 = new SameIterator(2, sameIterator);
		
		//thread1.start();
		//thread2.start();
		
		//own iterator
		System.out.println("\nOwn iterator in use");
		Thread thread3 = new OwnIterator(3, numbers);
		Thread thread4 = new OwnIterator(4, numbers);
		
		//thread3.start();
		//thread4.start();
		
		//delete while iterating
		System.out.println("\nRemoving while iterator in use");
		Thread thread5 = new RemoveWhileIterate(5, numbers);
		//thread5.start();
		
		//change while iterating
		System.out.println("\nChanging while iterator in use");
		Thread thread6 = new ChangeWhileIterate(6, numbers);
		thread6.start();
	}
}
