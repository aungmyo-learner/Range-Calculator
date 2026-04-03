

public class Summary {
	private final int totalSum;
	private final int countEven;
	private final int countOdd;
	private final int countPrime;
	private final int countComposite;
	
	public Summary(int totalSum, int countEven, int countOdd, int countPrime, int countComposite) {
		this.totalSum = totalSum;
		this.countEven = countEven;
		this.countOdd = countOdd;
		this.countPrime = countPrime;
		this.countComposite = countComposite;
	}
	public int getTotalSum() {return totalSum;}
	public int getCountEven() {return countEven;}
	public int getCountOdd() {return countOdd;}
	public int getCountPrime() {return countPrime;}
	public int getCountComposite() {return countComposite;}
}
