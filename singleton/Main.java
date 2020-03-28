package singleton;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Balance is " + Balance.getInstance().getBalance());
		Transfer salary = new Income("salary", 2000);
		System.out.println(salary);
		salary.updateBalance(salary.getAmount());
		System.out.println("Balance after is " + Balance.getInstance().getBalance());
		Transfer bar = new Expense("bar", -100);
		System.out.println(bar);
		bar.updateBalance(bar.getAmount());
		System.out.println("Balance after is " + Balance.getInstance().getBalance());
	}
}
