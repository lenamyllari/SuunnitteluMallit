package visitor;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon(new Charmander());
		Pokemon pokemon2 = new Pokemon(new Pichu());
		
		ArrayList<Pokemon> team = new ArrayList<Pokemon>();
		team.add(pokemon);
		team.add(pokemon2);
		Visitor visitor = new PokemonVisitor();
		
		
		for(Pokemon p : team) {
			for (int i=0; i< 9; i++) {
				p.tellName();
				p.run();
				p.attack();	
				p.getState().accept(visitor);
				System.out.println("This pokemon state has " + p.getState().getPoints() + " bonus points");
			}
		}
	}
}
