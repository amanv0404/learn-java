
//5️ Partial transaction rollback on failure
//Simulate a simple in-memory bank transfer system where moving funds
//between accounts must rollback if an exception occurs mid-operation (e.g.,
//                                                                     invalid target account).
//Use try-catch to ensure that no partial transfer leaves accounts in an
//inconsistent state.

package exception.question6;

public class CustomException {

    // Simulates a file validation check (checked exception)
    public static void validateFile(String filename) throws FileValidationException {
        if (!filename.endsWith(".txt")) {
            throw new FileValidationException("Only .txt files are supported: " + filename);
        }
    }

    // Simulates a critical failure (unchecked exception)
    public static void simulateSystemFailure() throws CriticalSystemException {
        boolean criticalFailure = true;
        if (criticalFailure) {
            throw new CriticalSystemException("Critical system failure! Cannot continue.");
        }
    }

    public static void main(String[] args) {
        // Checked exception must be caught or declared
        try {
            validateFile("report.pdf");
        } catch (FileValidationException e) {
            System.err.println("Validation error: " + e.getMessage());
        }

        // Unchecked exception
        try {
            simulateSystemFailure();
        } catch (CriticalSystemException e) {
            System.err.println("System halted: " + e.getMessage());
        }



    }
}
