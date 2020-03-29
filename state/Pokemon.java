package state;

public class Pokemon {
	
	private PokemonState state;
	
	public Pokemon(PokemonState ps) {
		state = ps;
	}
	
	public void setState(PokemonState ps) {
		state = ps;
	}
	
	public void upgrade() {
		state.upgrade(this);
	}

	public void tellName() {
		state.tellName();
		
	}
	
	public void run() {
		state.run(this);
	}
	
	public void attack() {
		state.attack(this);
	}
}
