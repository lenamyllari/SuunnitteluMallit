package decorator;

public class PizzaBottom implements PizzaIngredient{
	private float price;
	private String label;
	
	public PizzaBottom(String label, float price) {
		this.label = label;
		this.price = price;
	}

	public float getPrice() {
		return price;
	};

	@Override
	public String getLabel() {
		return label;
	}
}
