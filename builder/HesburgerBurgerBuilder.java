package builder;

import java.util.List;
import java.util.ArrayList;

public class HesburgerBurgerBuilder extends BurgerBuilder{
	private List<String> burger;
	
	@Override
	public void createBurger() {
		this.burger = new ArrayList<>();
		this.burger.add("Hesburger burger:");
	}

	@Override
    public Object getBurger() {
		return this.burger;
		/*
		for(int i = 0; i<burger.size(); i++) {
			System.out.print(burger.get(i));
		}
		*/
    }
	
	@Override
	public void buildBun() {
		this.burger.add("soft bun");
	}

	@Override
	public void buildBeef() {
		this.burger.add("all-beef patty");
	}

	@Override
	public void buildSause() {
		this.burger.add("ketchup, mustard and famous cucumber mayonnaise");
		
	}

	@Override
	public void buildOnions() {
		this.burger.add("onion");
	}

	@Override
	public void buildPickle() {
		this.burger.add("pickles");
	}


}
