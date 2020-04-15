package visitor;

public interface Visitor {
	void visit(Charizard charizard);
	void visit(Charmander charmander);
	void visit(Charmeleon charmeleon);
	void visit(Pichu pichu);
	void visit(Pikachu pikachu);
	void visit(Raichu raichu);
	void visit(PokemonState state);
	
}
