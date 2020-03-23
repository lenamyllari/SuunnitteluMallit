package ComputerParts;

public class Monitor implements ComputerPart{

	private int price;

	public Monitor(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
}
