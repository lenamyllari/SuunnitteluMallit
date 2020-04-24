package prototype;

public class HandSecond implements Hand, Cloneable{
	private int maxValue = 60;
	private int value;
	
	public HandSecond() {
		
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
		//alle 60 sekuntia, minuutti viisarin ei tarvi liikkua, koska sekunti viisari liikkuu
		if (value<maxValue) {
			return true;
		}
		//60 sek, nyt minuutiviisarin pitää liikkua
		value=0;
		return false;
	}
	
	protected Hand clone() throws CloneNotSupportedException {
		return (Hand) super.clone();
	}

}
