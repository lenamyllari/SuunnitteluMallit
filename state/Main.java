package state;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon(new Charmander());
		pokemon.tellName();
		for (int i=0; i< 9; i++) {
			pokemon.run();
			pokemon.attack();			
		}
	}
}
/*Tulostus:
 * Hi, I'm Charmander!
I'm walking!
Beware of my flamethrower!
I'm walking!
Beware of my flamethrower!
I'm walking!
Now I'm Charmeleon!
Beware of my fire punch!
I'm running!
Beware of my fire punch!
I'm running!
Beware of my fire punch!
I'm running!
Beware of my fire punch!
I'm running!
Beware of my fire punch!
I'm running!
Now I'm Charizard!
Beware of my fire spin!
I'm flying!
Beware of my fire spin!
*/
