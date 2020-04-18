package builder;

public abstract class BurgerBuilder {
	
	public abstract Object getBurger();
	
	public abstract void createBurger();
	
	public abstract void buildBun();
	public abstract void buildBeef();
	public abstract void buildSause();
	public abstract void buildOnions();
	public abstract void buildPickle();

}
