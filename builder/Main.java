package builder;

public class Main {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		BurgerBuilder hesburger = new HesburgerBurgerBuilder();
		BurgerBuilder mcDonalds = new McDonaldsBurgerBuilder();
		waiter.setBurgerBuilder(hesburger);
		waiter.constructBurger();
		System.out.println(waiter.getBurger());
		waiter.setBurgerBuilder(mcDonalds);
		waiter.constructBurger();
		System.out.println(waiter.getBurger());

	}

}
