package ComputerParts;

public class Case implements CompositeComputerPart{
	private List <ComputerPart> parts = new ArrayList<ComputerPart>();
	private int price;

	public Case(int price) {
		this.price = price;
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

}
