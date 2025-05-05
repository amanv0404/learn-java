package multithreading.assignment1;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Logger {
    private final BlockingQueue<LogMessage> queue = new LinkedBlockingQueue<>();
    private final AtomicBoolean running = new AtomicBoolean(true);
    private final Thread worker;


    public  Logger(){
        // This defines what the worker thread will do.
        worker = new Thread(()->{
//            While the logger is not shut down, or there are still logs waiting to be printed
//            Keep looping.
           while(running.get() || !queue.isEmpty()){
               try{
                   flushLogs(); // print whatever is in the queue
                   Thread.sleep(5000); // wait 5 seconds
               } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
               }
           }
        });
        worker.start();
    }

    public  void shutDown(){
        running.set(false); // stop the worker loop
        try{
            worker.join(); // wait for thread to finish
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public void log(LogLevel level, String message) {
        // it creates a new LogMessage object and puts it in the queue.
        queue.offer(new LogMessage(level, message));
    }

    private void flushLogs(){
        // This takes all messages from the queue one by one and prints them.
        LogMessage msg;
        while((msg = queue.poll())!= null){
            System.out.println(msg);
        }
    }

}
