package adapter;

public class Thermometer {
	private int temperature;
	
	public Thermometer() {
		this.temperature=0;
	}
	
	public int getTemperature() {
		return getMeasured();
	}
	
	public int getMeasured() {
		this.temperature = 100;
		return this.temperature;
	}
	
	
}
