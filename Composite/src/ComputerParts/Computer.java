package ComputerParts;

import java.util.ArrayList;
import java.util.List;

import factories.ComputerFactory;

public class Computer implements CompositeComputerPart{
	private List <ComputerPart> parts = new ArrayList<ComputerPart>();
	private int price;
	private ComputerFactory factory;
	
	public Computer(ComputerFactory factory) {
		this.factory = factory;
	}

	@Override
	public int getPrice() {
		for (ComputerPart cp : parts){
			price += cp.getPrice();
		}
		return price;
	}

	@Override
	public void addPart(ComputerPart part) {
		parts.add(part);
	}

	public ComputerFactory getFactory() {
		return factory;
	}

	public void setFactory(ComputerFactory factory) {
		this.factory = factory;
	}


}
