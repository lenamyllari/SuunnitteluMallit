
public class BossFactory implements AbstractFactory{

	@Override
	public String makeFarkut() {
		Housut housut = new Housut();
		return "Boss " + housut;
	}

	@Override
	public String makeTpaita() {
		Paita paita = new Paita();
		return "Boss " + paita;
	}

	@Override
	public String makeLippis() {
		Hattu hattu = new Hattu();
		return "Boss " + hattu;
	}

	@Override
	public String makeKengat() {
		Kengat kengat = new Kengat();
		return "Boss " + kengat;
	}



}
