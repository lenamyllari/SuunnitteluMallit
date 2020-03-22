
public class Main {
	 public static void main(String[] args) {
		
		 AbstractFactory adidasFactory = new AdidasFactory();
		 Person jasper = new Person("Jasper", adidasFactory);
		 jasper.pue();
		 AbstractFactory bossFactory = new BossFactory();
		 jasper.setFactory(bossFactory);
		 jasper.pue();
	    }
}
