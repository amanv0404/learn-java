
//7️ Handling suppressed exceptions from multiple close
//operations
//Write a try-with-resources block where two custom resources both
//throw exceptions in close().
//Capture and display the suppressed exceptions from the primary one.


package exception.question7;

public class SuppressedException {
    public static void main(String[] args) {
        try (ResourceA a = new ResourceA(); ResourceB b = new ResourceB()) {
            System.out.println("Using resources...");

        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());


            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed: " + suppressed.getMessage());
            }
        }
    }
}
