import ComputerParts.Computer;
import factories.AppleFactory;
import factories.ComputerFactory;
import factories.IBMfactory;


public class Main {
	 public static void main(String[] args) {
		ComputerFactory factoryApple = new AppleFactory();
		ComputerFactory factoryIBM = new IBMfactory();
		Computer computer = new Computer(factoryApple);	
		char select;
        do {
            System.out.println("\n\t\t\t1. Add part a new computer.");
            System.out.println("\t\t\t2. Print the price.");
            System.out.println("\t\t\t3. Choose the factory. Default is Apple");
            System.out.println("\t\t\t4. Stop the programme.");
            System.out.print("\n"); // tehdään tyhjiä rivejä
            select = Lue.merkki();
            switch (select) {
            case '1':
                do {
                    System.out.println("\n\t\t\t5. Return to the main menu.");
                    System.out.println("\t\t\t6. Add keyboard.");
                    System.out.println("\t\t\t7. Add case.");
                    System.out.println("\t\t\t8. Add monitor.");
                    System.out.print("\n"); // tehdään tyhjiä rivejä
                    select = Lue.merkki();
                    switch (select) {
                    case '8':
                    	System.out.println("Monitor added.");
                        computer.addPart(computer.getFactory().makeMonitor());
                        break;
                    case '6':
                    	System.out.println("Keyboard added.");
                    	computer.addPart(computer.getFactory().makeKeyBoard());
                        break;
                    case '7':
                    	System.out.println("Case added.");
                    	computer.addPart(computer.getFactory().makeCase());
                        break;
                    case '5':
                        break;
                   
                    } 
                } while (select != '5');
                break;
            case '2':
                System.out.println("The price at the moment is: "+computer.getPrice());
                break;
            case '3':
                    System.out.println("\n\t\t\t1. Apple.");
                    System.out.println("\t\t\t2. IBM.");
                    System.out.println("\t\t\t3. Return to the main menu.");
                    System.out.print("\n"); // tehdään tyhjiä rivejä
                    select = Lue.merkki();
                    switch (select) {
                    case '1':
                    	System.out.println("Apple factory selected");
                        computer.setFactory(factoryApple);
                        break;
                    case '2':
                    	System.out.println("IBM factory selected");
                    	computer.setFactory(factoryIBM);
                        break;
                    case '3':
                        break;
                    } 
            	break;
            case '4':
                break;
            }
    }
    while (select != '3');
	    }
}
