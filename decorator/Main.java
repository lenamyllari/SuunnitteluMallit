package decorator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Menu:");
		
		PizzaIngredient bottom = new PizzaBottom("Gluten free bottom", 3);
		bottom = new Mushroom("chanterelles", 2, bottom);
		bottom = new Mozzarella("Italian mozzarella", (float) 1.5, bottom);
		bottom = new Ruccola("baby ruccola", 2, bottom);
		System.out.println(bottom.getLabel() + ", price: " + bottom.getPrice());
		
		PizzaIngredient bottom2 = new PizzaBottom("Pan pizza bottom", 3);
		bottom2 = new Mushroom("champignons", 1, bottom2);
		bottom2 = new Mozzarella("Italian mozzarella", (float) 1.5, bottom2);
		bottom2 = new Ham("ham", 4, bottom2);
		System.out.println(bottom2.getLabel() + ", price: " + bottom2.getPrice());
		
		PizzaIngredient bottom3 = new PizzaBottom("Classic pizza bottom", 3);
		bottom3 = new Shrimps("shrimps", 3, bottom3);
		bottom3 = new Mozzarella("Italian mozzarella", (float) 1.5, bottom3);
		bottom3 = new Ham("ham", 4, bottom3);
		bottom3 = new Ruccola("baby ruccola", 2, bottom3);
		System.out.println(bottom3.getLabel() + ", price: " + bottom3.getPrice());
	}
}
/* Tuslostus:
Menu:
Gluten free bottom, chanterelles, Italian mozzarella, baby ruccola, price: 8.5
Pan pizza bottom, champignons, Italian mozzarella, ham, price: 9.5
Classic pizza bottom, shrimps, Italian mozzarella, ham, baby ruccola, price: 13.5
*/