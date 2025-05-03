package multithreading.assignment1;

public class OddThread extends Thread {

    private Resource resource = null;

    public OddThread(Resource r1){
       this.resource = r1;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 99; i += 2) {
            synchronized (resource.getLock()){
                while (!resource.isOddTurn()){
                    try {
                        // this thread will wait until it's turn
                        resource.getLock().wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                System.out.println(i + " Odd Thread");
                resource.setOddTurn(false); // now it's even turn
                resource.getLock().notify(); // wake up even thread
            }
        }
    }
}
