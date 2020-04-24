package prototype;

public class ClockShallow implements Clock, Cloneable{
	private HandSecond seconds;
	private HandMinute minutes;
	private HandHour hours;
	
	public ClockShallow(HandSecond seconds, HandMinute minutes, HandHour hours) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}
	@Override
	public int getHours() {
		return hours.getValue();
	}

	@Override
	public int getMinutes() {
		return minutes.getValue();
	}

	@Override
	public int getSeconds() {
		return seconds.getValue();
	}

	public void setSeconds(int value) {
		seconds.setValue(value);
	}

	@Override
	public void setHours(int value) {
		hours.setValue(value);
	}

	@Override
	public void setMinutes(int value) {
		minutes.setValue(value);
	}
	
	@Override
	public void tick() {
		if(!seconds.tick()) {
			if(!minutes.tick()) {
				hours.tick();	
			}
		}	
	}
	
	public void getTime() {
		System.out.println(hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue());
	}
	
	@Override
	public Object clone() {

		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			
		}
		return null;
	}

}
