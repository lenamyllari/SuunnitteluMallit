package adapter;

public class Main {

	public static void main(String[] args) {
		Thermometer thermometer = new Thermometer();
		TemperatureAdapterImpl adapter = new TemperatureAdapterImpl(thermometer);
		System.out.println("Temperature in celcius " + adapter.getTemperature());
	}

}
