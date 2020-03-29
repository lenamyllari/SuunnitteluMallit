package state;

public interface PokemonState {
	public void tellName();
	public void attack(Pokemon pokemon);
	public void run(Pokemon pokemon);
	public void upgrade(Pokemon pokemon);
	public boolean checkUpgrade();
}
