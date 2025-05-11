//1️1️ Thread exception handling
//Write a multithreaded program where a child thread throws a
//RuntimeException.
//Show how the main thread can detect and handle that exception using
//Thread.setUncaughtExceptionHandler().


package exception.question11;

public class ThreadExceptionHandling {
    public static void main(String[] args) {

        // Define the task for the child thread
        Runnable task = () -> {
            System.out.println("Child thread running...");
            throw new RuntimeException("Something went wrong in the child thread!");
        };

        // Create the thread
        Thread childThread = new Thread(task);

        // Set the UncaughtExceptionHandler for this thread
        childThread.setUncaughtExceptionHandler((thread, exception) -> {
            System.out.println("Exception caught from thread: " + thread.getName());
            System.out.println("Exception message: " + exception.getMessage());
        });

        // Start the thread
        childThread.start();

        try {
            childThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
