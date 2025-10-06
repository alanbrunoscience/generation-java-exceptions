package examples;

public class DataProcessor {

	/**
	 * This method processes an array and DECLARES with 'throws' that it might throw
	 * a SimpleException if an invalid name is found. The method itself does NOT
	 * handle the exception.
	 * 
	 * @param names: The array of names to be processed.
	 * 
	 * @throws SimpleException: The exception thrown if validation fails.
	 * 
	 */
	public static void processData(String[] names) throws SimpleException {
		System.out.println("\n--- Starting Data Processing ---\n");

		for (String name : names) {
			if (name.length() < 3) {
				// If the condition is violated, we explicitly THROW the exception.
				// The 'throws' in the signature allows us to do this without a try-catch here.
				throw new SimpleException("ERROR: Name '" + name + "' is too short!");
			}
			System.out.println("→ Processed name: " + name);
		}

		System.out.println("\n--- Processing Finished Successfully ---");
	}
}