package examples;

public class TestsSimpleException {

	// The main method does NOT use 'throws' because it is HANDLING the exception.
	public static void main(String[] args) {

		// Array containing a name ("A") that will fail the validation (length < 3)
		String names[] = { "John", "Maria", "Pete", "A", "Manuela" };

		System.out.println("Application started:");

		try {
			// The method call MUST be wrapped in try-catch to handle the declared
			// SimpleException.
			DataProcessor.processData(names);

		} catch (SimpleException e) {
			// This block catches the exception that was PROPAGATED by the processData
			// method.
			System.err.println("\n🚨 EXCEPTION CAUGHT IN MAIN METHOD! 🚨");

			// Print the specific error message defined in the exception.
			System.err.println("Message: " + e.getMessage());

		} catch (Exception e) {
			// Generic block for any other unexpected exception.
			System.err.println("\n❌ Unexpected Error: " + e.getMessage());
		}

		System.out.println("\nApplication finished gracefully.");
	}

}