package visitor;

public class PokemonVisitor implements Visitor{

	@Override
	public void visit(Charizard charizard) {
		charizard.addPoints(1);
		
	}

	@Override
	public void visit(Charmander charmander) {
		charmander.addPoints(10);
	}

	@Override
	public void visit(Charmeleon charmeleon) {
		charmeleon.addPoints(5);
		
	}

	@Override
	public void visit(Pichu pichu) {
		pichu.addPoints(10);
		
	}

	@Override
	public void visit(Pikachu pikachu) {
		pikachu.addPoints(5);
		
	}

	@Override
	public void visit(Raichu raichu) {
		raichu.addPoints(1);
		
	}

	@Override
	public void visit(PokemonState state) {
		// TODO Auto-generated method stub
		
	}

}
