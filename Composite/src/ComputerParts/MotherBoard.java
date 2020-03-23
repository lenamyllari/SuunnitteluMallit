package ComputerParts;

public class MotherBoard implements CompositeComputerPart{

	private int price;

	public MotherBoard(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void addPart(ComputerPart part) {
		this.price +=part.getPrice();
	}
}
