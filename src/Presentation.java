

import java.util.Scanner;

public class Presentation {
	private final Scanner sc;
	public Presentation(Scanner sc) {
		this.sc = sc;
	}
	public NumberRange input() {
		NumberRange numberRange = null;
		System.out.println("Enter start and end number between -1,000,000 and 1,000,000");
		int start = Integer.parseInt(sc.nextLine());
		int end = Integer.parseInt(sc.nextLine());
		numberRange = new NumberRange(start, end);
		return numberRange;
	}
	public void report(Summary result) {
		if(result == null) {
			System.out.println("Out of Range Or Number is greater than Range.");
		}else {
			System.out.println("Total Sum in Range: " + result.getTotalSum());
			System.out.println("Count of Even: " + result.getCountEven());
			System.out.println("Count of Odd: " + result.getCountOdd());
			System.out.println("Count of Prime: " + result.getCountPrime());
			System.out.println("Count of Composite: " + result.getCountComposite());
		}
	}
}
