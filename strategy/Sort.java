package strategy;

public class Sort {
	private int[] numbers; 
	private SortingStrategy strategy;

	
	public Sort(SortingStrategy strategy, int []numbers) {
		this.strategy = strategy;
		this.numbers = numbers;
	}
	
	public void setStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int[] sort() {
		return this.strategy.sort(this.numbers);
	}
}
