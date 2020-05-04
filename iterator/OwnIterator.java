package iterator;

import java.util.Iterator;
import java.util.List;

public class OwnIterator extends Thread{
	private int id;
	private List<Integer> list;
	
	public OwnIterator(int id, List<Integer> list) {
		this.id = id;
		this.list = list;
	}
	
	@Override
	public void run() {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			System.out.println("Thread " + id + " iterated number " + value);
		}
	}
}
