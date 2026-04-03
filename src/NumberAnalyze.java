

public class NumberAnalyze {
	private final int number;
	public NumberAnalyze(int number) {
		this.number = number;
	}
	public Result analyze() {
		boolean isEven = isEven();
		NumberKinds prime = isPrime();
		Signs sign = detectSign();
		Result result = new Result(isEven, prime, sign);
		return result;
	}
	private boolean isEven() {
		return number % 2 ==0;
	}
	private NumberKinds isPrime() {
		int i =2;
		if(number <=1) return NumberKinds.Neither;
		while(i * i < number && number >1) {
			if(number % 2 ==0) return NumberKinds.Composite;
			i++;
		}
		return NumberKinds.Prime;
	}
	private Signs detectSign() {
		if(number > 0)	return Signs.Positive;
		if(number < 0) return Signs.Negative;
		return Signs.Zero;
	}
}
