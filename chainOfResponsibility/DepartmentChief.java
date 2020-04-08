package chainOfResponsibility;

public class DepartmentChief extends PayRise{
	private final double ALLOWABLE_MIN = 0.02;
	private final double ALLOWABLE_MAX = 0.05;
	public void processRequest(PayRiseRequest request) { 
		if (request.getAmount()/request.getSalary() > ALLOWABLE_MIN && request.getAmount()/request.getSalary() < ALLOWABLE_MAX) { 
			System.out.println( "DepartmentChief will approve $" + request.getAmount()); 
			} else { 
				System.out.println( "DepartmentChief says: 'Not my responsibilty'");
				super.processRequest(request); 
				} 
		}

}
