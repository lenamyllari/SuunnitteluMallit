package decorator;

public class Shrimps extends PizzaDecorator{

	public Shrimps(String lable, float price, PizzaIngredient pi) {
		super(lable, price, pi);
	}
}