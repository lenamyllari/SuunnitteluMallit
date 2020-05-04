package iterator;

import java.util.Iterator;
import java.util.List;

public class RemoveWhileIterate extends Thread{
	private int id;
	private List<Integer> list;
	
	public RemoveWhileIterate(int id, List<Integer> list) {
		this.id = id;
		this.list = list;
	}
	
	@Override
	public void run() {
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			if(value % 4 ==0) {
				iterator.remove();
			}
			System.out.println("Thread " + id + " iterated number " + value);
			
		}
		System.out.println("Numbers: " + list);
	}
}
