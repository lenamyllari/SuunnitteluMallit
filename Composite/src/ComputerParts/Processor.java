package ComputerParts;

public class Processor implements ComputerPart{
	private int price;

	public Processor(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
}
