package state;

public class Pokemon {
	
	private PokemonState state;
	private int amountRun;
	private int amountAttack;
	
	public Pokemon(PokemonState ps) {
		state = ps;
		this.amountRun=0;
		this.amountAttack=0;
	}
	
	public void setState(PokemonState ps) {
		state = ps;
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
	
		public void updateRun(int amount) {
		amountRun+=amount;
	}
	public void updateAttack(int amount) {
		amountAttack+=amount;
	}

	public int getAmountRun() {
		return amountRun;
	}

	public int getAmountAttack() {
		return amountAttack;
	}
}
