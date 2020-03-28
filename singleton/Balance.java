package singleton;

public class Balance {

	private float balance;

	public static final Balance balanceInstance = new Balance();
	
	private Balance(){
		this.balance=0;
	}
	
	public static Balance getInstance(){ 
		return balanceInstance; 
	}


	public float getBalance() {
		return balance;
	}
	
	public void updateBalance(float amount) {
		this.balance+=amount;
	}
}
