package prototype;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		HandSecond seconds = new HandSecond();
		HandMinute minutes = new HandMinute();
		HandHour hours = new HandHour();
		seconds.setValue(calendar.get(Calendar.SECOND));
		minutes.setValue(calendar.get(Calendar.MINUTE));
		hours.setValue(calendar.get(Calendar.HOUR));
		
		System.out.println("Time now: " + hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue());
		
		ClockDeep deepCopyClock = new ClockDeep(seconds, minutes, hours);
		
		HandSecond seconds2 = new HandSecond();
		HandMinute minutes2 = new HandMinute();
		HandHour hours2 = new HandHour();
		seconds2.setValue(calendar.get(Calendar.SECOND));
		minutes2.setValue(calendar.get(Calendar.MINUTE));
		hours2.setValue(calendar.get(Calendar.HOUR));
		
		ClockShallow shallowCopyClock = new ClockShallow(seconds2, minutes2, hours2);
		
		for(int i = 0; i<10; i++) {
			deepCopyClock.tick();
			shallowCopyClock.tick();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Deep original:");
		deepCopyClock.getTime();
		System.out.println("Shallow original:");
		shallowCopyClock.getTime();
		
		ClockDeep deepCopy = deepCopyClock.clone();
		ClockShallow shallowCopy = (ClockShallow) shallowCopyClock.clone();
		
		deepCopyClock.setHours(deepCopyClock.getHours()+1);
		shallowCopyClock.setHours(shallowCopyClock.getHours()+1);

		for(int i = 0; i<10; i++) {
			deepCopy.tick();
			deepCopyClock.tick();
			shallowCopyClock.tick();
			shallowCopy.tick();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Deep original:");
		deepCopyClock.getTime();
		System.out.println("Deep copy:");
		deepCopy.getTime();
		System.out.println("Shallow original:");
		shallowCopyClock.getTime();
		System.out.println("Shallow copy:");
		shallowCopy.getTime();
	}

}
