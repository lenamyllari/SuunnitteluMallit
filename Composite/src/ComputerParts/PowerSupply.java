package ComputerParts;

public class PowerSupply implements ComputerPart{

	private int price;

	public PowerSupply(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

}
