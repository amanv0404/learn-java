
//8️ Programmatic exception handling policy
//        Implement a retry mechanism: write a method that attempts to read from a flaky
//        service 3 times. If it fails all 3 times, it throws a
//        ServiceUnavailableException.


package exception.question8;

import java.util.Random;

public class RetryMechanism {

    public static String readFromService() throws Exception {
        if (new Random().nextInt(3) != 0) {
            throw new Exception("Service read failed.");
        }
        return "Service data received.";
    }

    public static String retryRead(int maxAttempts) throws ServiceUnavailableException {
        int attempts = 0;

        while (attempts < maxAttempts) {
            try {
                return readFromService();  // Attempt to read
            } catch (Exception e) {
                attempts++;
                System.out.println("Attempt " + attempts + " failed: " + e.getMessage());

                if (attempts == maxAttempts) {
                    throw new ServiceUnavailableException("Service failed after " + maxAttempts + " attempts.");
                }

                try {
                    Thread.sleep(500); // Optional: simulate backoff
                } catch (InterruptedException ignored) {}
            }
        }
        return null; // Unreachable, but required by compiler
    }

    public static void main(String[] args) {
        try {
            String result = retryRead(3);
            System.out.println("Success: " + result);
        } catch (ServiceUnavailableException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
