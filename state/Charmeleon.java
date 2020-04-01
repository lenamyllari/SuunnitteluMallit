package state;

public class Charmeleon implements PokemonState{
	
	@Override
	public void tellName() {
		System.out.println("Now I'm Charmeleon!");
		
	}


	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Beware of my fire punch!");
		pokemon.updateAttack(5);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=50) {
			upgrade(pokemon);
		}
		
	}

	@Override
	public void run(Pokemon pokemon) {
		System.out.println("I'm running!");
		pokemon.updateRun(5);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=50) {
			upgrade(pokemon);
		}
	}

	@Override
	public void upgrade(Pokemon pokemon) {
		pokemon.setState(new Charizard());
		pokemon.tellName();
	}


}
