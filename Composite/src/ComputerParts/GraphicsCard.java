package ComputerParts;

public class GraphicsCard implements ComputerPart{

	private int price;

	public GraphicsCard(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

}
