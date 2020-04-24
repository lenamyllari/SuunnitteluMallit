package prototype;

public class HandMinute implements Hand, Cloneable{
	private int maxValue = 60;
	private int value;
	
	public HandMinute() {
		
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
		//alle 60 minuuttia, tunti viisarin ei tarvi liikkua, koska minuutti viisari liikkuu
		if (value<maxValue) {
			return true;
		}
		//60 min, nyt tuntiviisarin pitää liikkua
		value=0;
		return false;
	}

	protected Hand clone() throws CloneNotSupportedException {
		return (Hand) super.clone();
	}
}
