package builder;

public class McDonaldsBurgerBuilder extends BurgerBuilder{
	private StringBuilder burger;
	
	@Override
	public void createBurger() {
		this.burger = new StringBuilder();
		this.burger.append("McDonalds burger: ");
		
	}

	@Override
	public Object getBurger() {
		return this.burger;
		//System.out.println(this.burger);
	}
	
	@Override
	public void buildBun() {
		this.burger.append("regular bun, ");
		
	}

	@Override
	public void buildBeef() {
		this.burger.append("100% pure beef patty, ");
		
	}

	@Override
	public void buildSause() {
		this.burger.append("ketchup and mustard");
		
	}

	@Override
	public void buildOnions() {
		this.burger.append("chopped onions, ");
		
	}

	@Override
	public void buildPickle() {
		this.burger.append("pickles, ");
		
	}



}
