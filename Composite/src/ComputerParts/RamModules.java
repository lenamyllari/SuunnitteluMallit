package ComputerParts;

public class RamModules implements ComputerPart{

	private int price;

	public RamModules(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

}
