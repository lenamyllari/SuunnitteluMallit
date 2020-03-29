package decorator;

public abstract class PizzaDecorator implements PizzaIngredient{
	protected PizzaIngredient piToBeDecorated;
	private String label;
	private float price;
	
	public PizzaDecorator(String label, float price, PizzaIngredient pi) {
		this.piToBeDecorated = pi;
		this.label = label;
		this.price = price;
	}
	
	public String getLabel() {
		return piToBeDecorated.getLabel() + ", " + this.label;
	}
	public float getPrice() {
		return piToBeDecorated.getPrice()+ this.price;
	}
}
