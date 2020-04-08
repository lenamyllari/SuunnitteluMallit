package chainOfResponsibility;

public class PayRiseRequest {
	private double amount;
	private double salary; 
	
	public PayRiseRequest(double amount, double salary) {
		this.amount = amount; 
		this.salary = salary;
		}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAmount() {
		return amount; 
		} 
	public void setAmount(double amt)  {
		amount = amt; 
		}

}
