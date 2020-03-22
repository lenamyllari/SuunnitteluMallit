
public class Person {
	
	private String nimi;
	private AbstractFactory factory;
	
	public Person(String nimi, AbstractFactory factory){
		this.nimi = nimi;
		this.factory = factory;
	}

	public void pue() {
		System.out.println(this.nimi + "lla on pällä " + 
				factory.makeFarkut() + ", " + factory.makeTpaita() + ", " + 
				factory.makeLippis() + " ja " + factory.makeKengat() + ".");
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public AbstractFactory getFactory() {
		return factory;
	}

	public void setFactory(AbstractFactory factory) {
		this.factory = factory;
	}
}
