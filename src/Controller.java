

public class Controller {
	private final Service service;
	private final Presentation display;
	public Controller(Service service, Presentation display) {
		this.service = service;
		this.display = display;
	}
	public void controll() {
		NumberRange numberRange = display.input();
		service.analyzeNumber(numberRange);
		Summary result =  service.result(numberRange);
		display.report(result);
	}
}
