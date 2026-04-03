

public class Service {
	private final NumberRepository collect;
	public Service(NumberRepository collect) {
		this.collect = collect;
	}
	private final int min = -1_000_000;
	private final int max = 1_000_000;
	
	public void analyzeNumber(NumberRange numberRange) {
		int start = numberRange.getStart();
		int end = numberRange.getEnd();
		if(start > end) {
			start = numberRange.getEnd();
			end = numberRange.getStart();
		}
		if(haveRange(start) && haveRange(end)) {
			Result result = null;
			if(start < end) {
				int i = start;
				while( i <= end) {
					NumberAnalyze analyzer = new NumberAnalyze(i);
					result = analyzer.analyze();
					boolean isEven = result.isEven();
					NumberKinds kind = result.getKind();
					collect.countCollect(i,isEven , kind);
					i++;
				}
			}
		}
	}
	public Summary result(NumberRange numberRange) {
		Summary result = null;
		if(haveRange(numberRange.getStart()) && haveRange(numberRange.getEnd())) {
			int totalSum = collect.getTotalSum();
			int countEven = collect.getCountEven();
			int countOdd = collect.getCountOdd();
			int countPrime = collect.getCountPrime();
			int countComposite = collect.getCountComposite();
			result = new Summary(totalSum, countEven, countOdd, countPrime, countComposite);
		}
		return result;
	}
	private boolean haveRange(int number) {
		return min <= number && max >= number;
	}
}
