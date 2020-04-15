package visitor;

public interface PokemonState {
	public void addPoints(int amount);
	public void tellName();
	public void attack(Pokemon pokemon);
	public void run(Pokemon pokemon);
	public void upgrade(Pokemon pokemon);
	public void accept(Visitor visitor);
	public int getPoints();
}
