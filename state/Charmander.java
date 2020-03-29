package state;

public class Charmander implements PokemonState{
	private int amountRun;
	private int amountAttack;

	@Override
	public void tellName() {
		System.out.println("Hi, I'm Charmander!");
		
	}

	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Beware of my flamethrower!");
		amountAttack++;
		if(checkUpgrade()) {
			pokemon.upgrade();
		}
		
	}

	@Override
	public void run(Pokemon pokemon) {
		System.out.println("I'm walking!");
		amountRun++;
		if(checkUpgrade()) {
			pokemon.upgrade();
		}
	}

	@Override
	public void upgrade(Pokemon pokemon) {
		pokemon.setState(new Charmeleon());
		pokemon.tellName();
	}

	@Override
	public boolean checkUpgrade() {
		if(amountRun + amountAttack >=5) {
			return true;
		}
		return false;
	}

	
}
