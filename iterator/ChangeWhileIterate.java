package iterator;

import java.util.Iterator;
import java.util.List;

public class ChangeWhileIterate extends Thread{
	private int id;
	private List<Integer> list;
	
	public ChangeWhileIterate(int id, List<Integer> list) {
		this.id = id;
		this.list = list;
	}
	
	@Override
	public void run() {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			System.out.println("Thread " + id + " iterated number " + value);
			if(value == 10) {
				list.add(100);
			}
		}
		System.out.println("Numbers: " + list);
	}
}
