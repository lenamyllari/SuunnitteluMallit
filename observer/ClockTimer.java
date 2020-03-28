package observer;

import java.time.LocalTime;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable{

	private static final ClockTimer timerInstance = new ClockTimer();
	private long lastUpdatedTime;
	private int seconds;
	private int minutes;
	private int hours;
	
	private ClockTimer() {
		this.lastUpdatedTime = System.currentTimeMillis();
	}
	
	public static ClockTimer getInstance() {
		return timerInstance;
	}

	public int getSeconds() {
		return seconds;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHours() {
		return hours;
	}

	@Override
	public void run() {
		while(true) {
			if(System.currentTimeMillis()- lastUpdatedTime >=1000) {
				this.seconds++;
				if(seconds==60) {
					seconds = 0;
					minutes++;
				}
				if (minutes==60) {
					minutes=0;
					hours++;
				}
				this.lastUpdatedTime=System.currentTimeMillis();
				this.setChanged();
				this.notifyObservers();
			}
		}
		
	}
}
