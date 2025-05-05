//## Assignment 1: Multi-threaded Logging System
//
//### Background:
//
//You're building a high-throughput logging system for a large-scale application. Logs are generated from various parts of the system and should be stored in the order received, without blocking the producers.
//
//        ### Requirements:
//
//        ### Part 1: Basic Logging System
//
//- Implement a class `Logger` with the following features:
//        - Method: `void log(String message)`
//        - Accepts log messages from multiple threads concurrently.
//    - Stores the messages in the order they were received.
//    - Uses a separate thread to flush logs every 5 seconds to the console (simulate disk).
//
//        ### Part 2: Graceful Shutdown
//
//- Provide a method `void shutdown()` that:
//        - Ensures all pending logs are flushed.
//        - Terminates the logging thread cleanly.
//
//### Part 3: Stress Simulation
//
//- Simulate 100 threads each logging 100 messages.
//- Ensure that the messages do not get lost or printed out of order.
//
//        ### Bonus Requirements:
//
//        - Support log levels (`INFO`, `WARN`, `ERROR`)
//- Add timestamps to log entries
//- Provide optional file-based flushing instead of console (via configuration)

package multithreading.assignment1;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        int threadCount = 100;
        Thread[] threads = new Thread[threadCount];

        for(int i = 0; i < threadCount; i++){
            int id = i;
            threads[i] = new Thread(()->{
                for(int j = 0; j < 100; j++){
                    logger.log(LogLevel.INFO,"Thread "+ id + "- Message "+j);
                }
            });

            threads[i].start();
        }


        // Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join(); // wait for all logging threads to finish
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Shutdown logger
        logger.shutDown();
    }
}
