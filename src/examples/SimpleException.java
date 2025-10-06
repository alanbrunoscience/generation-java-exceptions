package examples;

/**
 * Custom Checked Exception: SimpleException
 * 
 * → This class defines a specific error related to data validation in our
 * business logic.
 * 
 * → Extends 'Exception' (instead of 'RuntimeException'), making it a CHECKED
 * EXCEPTION. This FORCES calling methods (like 'main') to either handle this
 * error with 'try-catch' or propagate it with 'throws'.
 */
public class SimpleException extends Exception {

	/**
	 * The serialVersionUID is a unique ID used for version control during
	 * serialization and deserialization.
	 * 
	 * → WHY IT'S HERE: Because the class is Serializable (inherited from
	 * Exception), this fixed ID (1L) guarantees that different versions of the
	 * compiled class will be compatible when an object is transmitted or stored.
	 * This prevents the InvalidClassException, ensuring robust data communication
	 * even if the class structure changes slightly in the future.
	 */
	private static final long serialVersionUID = 1L;

	public SimpleException() {
		super("A simple validation error occurred.");
	}

	public SimpleException(String message) {
		super(message);
	}

}