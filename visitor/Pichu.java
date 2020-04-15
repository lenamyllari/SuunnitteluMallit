package visitor;

public class Pichu implements PokemonState{
	private int points=0;

	@Override
	public void tellName() {
		System.out.println("Hi! I'm Pichu!");	
	}


	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Beware of my sparks!");
		pokemon.updateAttack(5);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=50) {
			upgrade(pokemon);
		}
	}

	@Override
	public void run(Pokemon pokemon) {
		System.out.println("I'm jumping!");
		pokemon.updateRun(5);
		if(pokemon.getAmountAttack() + pokemon.getAmountRun() >=50) {
			upgrade(pokemon);
		}
	}

	@Override
	public void upgrade(Pokemon pokemon) {
		pokemon.setState(new Pikachu());
		pokemon.tellName();
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
