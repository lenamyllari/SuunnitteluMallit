package visitor;

public class Charizard implements PokemonState{
	private int points =0;

	@Override
	public void tellName() {
		System.out.println("Now I'm Charizard!");
	}

	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("Beware of my fire spin!");
		pokemon.updateAttack(50);
	}

	@Override
	public void run(Pokemon pokemon) {
		System.out.println("I'm flying!");
		pokemon.updateRun(50);		
	}

	@Override
	public void upgrade(Pokemon pokemon) {
		System.out.println("Nowhere to upgrade, Charizard is perfect already");	
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
