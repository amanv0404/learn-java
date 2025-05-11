package exception.student_grades;

public class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}
