package chainOfResponsibility;

public abstract class PayRise {
	private PayRise successor;
	
	public void setSuccessor(PayRise successor) { 
		this.successor = successor; 
		}
	
	public void processRequest(PayRiseRequest request){ 
		if (successor != null) 
			successor.processRequest(request); 
		}
}
