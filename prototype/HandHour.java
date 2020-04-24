package prototype;

public class HandHour implements Hand, Cloneable{
	private int maxValue = 24;
	private int value;
	
	public HandHour() {
		
	}
	
	@Override
	public int getValue() {
		return this.value;
	}

	@Override
	public void setValue(int value) {
		this.value = value;	
	}

	@Override
	public boolean tick() {
		value++;
		if(value<maxValue) {
			return true;
		}
		//uusi päivä
		value = 0;
		return false;
	}

	protected Hand clone() throws CloneNotSupportedException {
		return (Hand) super.clone();
	}
}
