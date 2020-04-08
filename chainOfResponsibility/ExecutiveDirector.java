package chainOfResponsibility;

public class ExecutiveDirector extends PayRise{
	private final double ALLOWABLE = 0.05;
	public void processRequest(PayRiseRequest request) { 
		if (request.getAmount() > ALLOWABLE && System.currentTimeMillis()%3==0) { 
			System.out.println( "Vice President will approve $" + request.getAmount()); 
			} else { 
				System.out.println( "ExecutiveDirector says: 'No!' No way to get "  + request.getAmount()); 
				} 
		}

}
