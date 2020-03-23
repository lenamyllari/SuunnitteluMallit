package ComputerParts;

import factories.ComputerFactory;

public class Computer implements CompositeComputerPart{

	private int price;
	private ComputerFactory factory;
	
	public Computer(ComputerFactory factory) {
		this.factory = factory;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void addPart(ComputerPart part) {
		price +=part.getPrice();
	}

	public ComputerFactory getFactory() {
		return factory;
	}

	public void setFactory(ComputerFactory factory) {
		this.factory = factory;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
