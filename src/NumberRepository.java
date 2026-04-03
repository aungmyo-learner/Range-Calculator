

public class NumberRepository {
	private int totalSum;
	private int countEven;
	private int countOdd;
	private int countPrime;
	private int countComposite;
	
	public int getTotalSum() {return totalSum;}
	public int getCountEven() {return countEven;}
	public int getCountOdd() {return countOdd;}
	public int getCountPrime() {return countPrime;}
	public int getCountComposite() {return countComposite;}
	
	public void countCollect(int sum ,boolean isEven, NumberKinds kind) {
		add(sum, isEven, kind);
	}
	private void add(int sum ,boolean isEven, NumberKinds kind) {
		totalSum += sum;
		if(isEven) {
			countEven += 1;
		}else {
			countOdd += 1;
		}
		switch (kind) {
		case Prime:
			countPrime += 1;
			break;
		case Composite:
			countComposite += 1;
			break;
		default:
			break;
		}
	}
}
