package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer, Clock {

	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		this.timer = ct;
		timer.addObserver(this);
	}
	
	public void draw() {
		System.out.println("Aika mennyt: " + this.timer.getHours() + ":" + this.timer.getMinutes() + ":" +this.timer.getSeconds());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof ClockTimer) {
			this.draw();
		}
		
	}

}
