

public class Result {
	private final boolean valid;
	private final String message;
	private final boolean isEven;
	private final NumberKinds kind;
	private final Signs  sign;
	public Result(boolean isEven, NumberKinds kind, Signs sign) {
		this.valid = true;
		this.message = "";
		this.isEven = isEven;
		this.kind = kind;
		this.sign = sign;
	}
	public static Result invalid(String message) {
	       return new Result(false, message);
	}
	private Result(boolean valid, String message) {
	       this.valid = valid;
	       this.message = message;
	       this.isEven = false;
	       this.kind = NumberKinds.Neither;
	       this.sign = Signs.Zero;
	}
	public boolean isValid() {return valid;}
	public String getMessage() {return message;}
	public boolean isEven() {return isEven;}
	public NumberKinds getKind() {return kind;}
	public Signs getSign() {return sign;}
}
