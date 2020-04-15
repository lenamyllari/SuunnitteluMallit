package visitor;

public class Pokemon {
	private PokemonState state;
	private int amountRun;
	private int amountAttack;
	private int points;

	public Pokemon(PokemonState ps) {
		state = ps;
		this.amountRun=0;
		this.amountAttack=0;
		this.points=0;
	}
	
	public void setState(PokemonState ps) {
		state = ps;
	}
	public PokemonState getState() {
		return this.state;
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
		points++;
	}
	public void updateAttack(int amount) {
		amountAttack+=amount;
		points++;
	}

	public int getAmountRun() {
		return amountRun;
	}

	public int getAmountAttack() {
		return amountAttack;
	}
	
	public int getPoints() {
		return points;
	}

	public void addPoints(int points) {
		this.points += points;
	}
}
