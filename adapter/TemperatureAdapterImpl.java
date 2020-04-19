package adapter;

public class TemperatureAdapterImpl implements TemperatureAdapter{
	private Thermometer thermometer;
	
	public TemperatureAdapterImpl(Thermometer thermometer) {
		this.thermometer = thermometer;
	}

	@Override
	public int getTemperature() {
		return convertFarenheitToCelcius(thermometer.getTemperature());
	}

	private int convertFarenheitToCelcius(int temperature) {
		return ((temperature - 32)*5)/9;
	}
}
