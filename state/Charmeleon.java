package state;

public class Charmeleon implements PokemonState{
	private int amountRun;
	private int amountAttack;
	@Override
	public void tellName() {
		System.out.println("Now I'm Charmeleon!");
		
	}


	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Beware of my fire punch!");
		amountAttack+=5;
		if(checkUpgrade()) {
			pokemon.upgrade();
		}
		
	}

	@Override
	public void run(Pokemon pokemon) {
		System.out.println("I'm running!");
		amountRun+=5;
		if(checkUpgrade()) {
			pokemon.upgrade();
		}
	}

	@Override
	public void upgrade(Pokemon pokemon) {
		pokemon.setState(new Charizard());
		pokemon.tellName();
	}

	@Override
	public boolean checkUpgrade() {
		if(amountRun + amountAttack >=50) {
			return true;
		}
		return false;
	}

}
