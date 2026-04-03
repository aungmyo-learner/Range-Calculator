

import java.util.Scanner;

public class RangeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberRepository numberRepo = new NumberRepository();
		Service service = new Service(numberRepo);
		Presentation display = new Presentation(sc);
		Controller controller = new Controller(service, display);
		controller.controll();
		sc.close();
	}
}
