package ComputerParts;

public class Case implements CompositeComputerPart{

	private int price;

	public Case(int price) {
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
