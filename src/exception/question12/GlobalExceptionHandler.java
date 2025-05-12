//
//1️2️ Global exception handler
//Write a Java application where all uncaught exceptions are logged by setting a
//global exception handler (using
//                                  Thread.setDefaultUncaughtExceptionHandler()).

package exception.question12;

public class GlobalExceptionHandler {
    public static void main(String[] args) {

        // Set the default uncaught exception handler for all threads
        Thread.setDefaultUncaughtExceptionHandler((thread, exception) -> {
            System.err.println("Global handler caught exception from thread: " + thread.getName());
            System.err.println("Exception: " + exception);
        });

        // Start a thread that will throw an exception
        Thread t1 = new Thread(() -> {
            System.out.println("Thread t1 running...");
            throw new RuntimeException("Simulated failure in t1");
        });

        // Another thread that works fine
        Thread t2 = new Thread(() -> {
            System.out.println("Thread t2 running fine.");
        });

        t1.start();
        t2.start();
    }
}
