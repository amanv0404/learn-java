package exception.question6;

// Checked Exception (must be handled or declared)
public class FileValidationException extends Exception {
    public FileValidationException(String message) {
        super(message);
    }
}
