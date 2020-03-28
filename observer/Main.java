package observer;

public class Main {

	public static void main(String[] args) {

		Clock dg = new DigitalClock(ClockTimer.getInstance());
		Thread clockThread = new Thread(ClockTimer.getInstance());
		clockThread.run();
	}
}
