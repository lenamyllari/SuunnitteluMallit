package builder;

public class Waiter {
	private BurgerBuilder builder;
	
	public void setBurgerBuilder(BurgerBuilder bb) {
		this.builder = bb;
	}
	
	public Object getBurger() {
		return builder.getBurger();
	}
	
	public void constructBurger() {
		builder.createBurger();
		builder.buildBun();
		builder.buildBeef();
		builder.buildOnions();
		builder.buildPickle();
		builder.buildSause();
	}
}
