package exception.question6;

// Unchecked Exception (can be thrown without declaring)
public class CriticalSystemException extends Exception {
    public CriticalSystemException(String message) {
        super(message);
    }

}
