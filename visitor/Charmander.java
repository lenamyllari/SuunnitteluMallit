package visitor;

public class Charmander implements PokemonState{
	private int points =0;

	@Override
	public void tellName() {
		System.out.println("Hi, I'm Charmander!");
	}

	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Beware of my flamethrower!");
		pokemon.updateAttack(1);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=5) {
			upgrade(pokemon);
		}
	}

	@Override
	public void run(Pokemon pokemon) {
		System.out.println("I'm walking!");
		pokemon.updateRun(1);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=5) {
			upgrade(pokemon);
		}
	}

	@Override
	public void upgrade(Pokemon pokemon) {
		pokemon.setState(new Charmeleon());
		pokemon.tellName();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public void addPoints(int amount) {
		points +=amount;
		
	}
	
	public int getPoints() {
		return points;
	}
}
