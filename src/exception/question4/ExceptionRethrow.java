//Re-throwing exceptions with additional context
//Write a method that catches an exception and re-throws it wrapped inside a new
//exception with a custom message, preserving the original stack trace (throw
//  new CustomException("message", e))

package exception.question4;

public class ExceptionRethrow {

    public static void readData() throws NumberFormatException {
        String invalidNumber = "abc";
        Integer.parseInt(invalidNumber);
    }


    public static void processData() throws CustomProcessingException {
        try {
            readData();
        } catch (NumberFormatException e) {
            throw new CustomProcessingException("Failed to process numeric data", e);
        }
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (CustomProcessingException e) {
            System.err.println("Custom exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
