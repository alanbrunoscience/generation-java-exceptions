package examples;

public class SimpleException extends Exception {

	private static final long serialVersionUID = 1L;

	public SimpleException() {
	}

	public SimpleException(String message) {
		super(message);
	}

}
