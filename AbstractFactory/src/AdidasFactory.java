
public class AdidasFactory implements AbstractFactory {

	@Override
	public String makeFarkut() {
		Farkut farkut = new Farkut();
		return "Adidas " + farkut;
	}

	@Override
	public String makeTpaita() {
		Tpaita tpaita = new Tpaita();
		return "Adidas " + tpaita;
	}

	@Override
	public String makeLippis() {
		Lippis lippis = new Lippis();
		return "Adidas"  + lippis;
	}

	@Override
	public String makeKengat() {
		Kengat kengat = new Kengat();
		return "Adidas " + kengat;
	}
	

}
