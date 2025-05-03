//## Assignment 4: Thread Pool Image Processor
//Simulate a parallel image processing pipeline using Java’s `ExecutorService`.
//        ### Requirements:
//        - Given 50 image IDs (1–50), simulate processing (sleep 100ms)
//        - Return a message "Image X processed" for each
//- Collect and print results in order using `Callable` + `Future`
//        ### Bonus Requirements:
//
//        - Use a fixed thread pool of size 5
//        - Measure total execution time


package multithreading.assignment4;

import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<String>> futures = new ArrayList<>();


        // submit 50 image processing task
        for(int i = 1; i <= 50; i++){
            futures.add(executor.submit(new ImageProcessor(i)));
        }

        // collect and print result in order
        for(Future<String> future : futures){
            String result = future.get();
            System.out.println(result);
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: "+(endTime-startTime)+" ms");
    }

}
