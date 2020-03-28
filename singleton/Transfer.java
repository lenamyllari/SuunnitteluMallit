package singleton;

public class Transfer {
	private float amount;
	private String description;
	Balance balance = Balance.getInstance();
	
	public Transfer(String description, float amount) {
		this.description = description;
		this.amount = amount;
	}
	
	public float getAmount() {
		return this.amount;
	}; 
	

	@Override
	public String toString() {
		return this.getDescription() + " " + this.getAmount();
	}


	public String getDescription() {
		return this.description;
	}
	
	public void updateBalance(float amount) {
		balance.updateBalance(amount);
	}


}
