package businesslayer;

public class InvalidTelephoneException extends Exception {
	public InvalidTelephoneException(String message) {
		super(message);
		System.out.println("Phone trouble");
	}
}
