package iterator;

import java.util.Iterator;

public class SameIterator extends Thread{
	private int id;
	private Iterator<Integer> iterator;
	
	public SameIterator(int id, Iterator<Integer> iterator) {
		this.id = id;
		this.iterator = iterator;
	}
	
	@Override
	public void run() {
		while(iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			System.out.println("Thread " + id + " iterated number " + value);
		}
	}
}
