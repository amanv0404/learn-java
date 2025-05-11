
//9️ Using Exception as a control mechanism (and why it’s
//        bad)
//Write a program that (incorrectly) uses exceptions to break out of normal loops
//        (e.g., using a try-catch inside a loop instead of a proper break condition).
//Then refactor it to avoid misuse.


package exception.question10;

public class ExceptionControlBad {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "error", "cherry"};

        for (String item : data) {
            try {
                if (item.equals("error")) {
                    throw new Exception("Unwanted item");
                }
                System.out.println("Processing: " + item);
            } catch (Exception e) {
                System.out.println("Skipping item due to error: " + e.getMessage());
            }
        }
    }
}
