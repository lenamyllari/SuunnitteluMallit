package chainOfResponsibility;

public class Manager extends PayRise{
	private final double ALLOWABLE = 0.02;
	
	public void processRequest(PayRiseRequest request) { 
		if (request.getAmount()/request.getSalary() < ALLOWABLE) { 
			System.out.println( "Manager will approve $" + request.getAmount()); 
			} else { 
				System.out.println( "Manager says: 'Not my responsibilty'"); 
				super.processRequest(request); 
				} 
		}

}
