package visitor;

public class Raichu implements PokemonState{
	private int points=0;


	@Override
	public void tellName() {
		System.out.println("Now I'm Raichu!");	
	}


	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Beware of my lightning!");
		pokemon.updateAttack(5);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=50) {
			upgrade(pokemon);
		}
	}

	@Override
	public void run(Pokemon pokemon) {
		System.out.println("I'm almost flying!");
		pokemon.updateRun(5);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=50) {
			upgrade(pokemon);
		}
	}

	@Override
	public void upgrade(Pokemon pokemon) {
		System.out.println("Nowhere to upgrade, Raichu is perfect already");;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


	@Override
	public void addPoints(int amount) {
		points+=amount;
		
	}
	
	public int getPoints() {
		return points;
	}
}
