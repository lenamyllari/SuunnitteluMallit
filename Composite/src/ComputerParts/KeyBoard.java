package ComputerParts;

public class KeyBoard implements ComputerPart{

	private int price;

	public KeyBoard(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

}
