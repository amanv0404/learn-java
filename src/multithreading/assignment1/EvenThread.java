package multithreading.assignment1;

public class EvenThread extends Thread{

    private Resource resource = null;

    public EvenThread(Resource r1){
        this.resource = r1;
    }

    @Override
    public void run() {
        for(int i = 2; i <= 100; i+=2){
            synchronized (resource.getLock()){

                while (resource.isOddTurn()){
                    try {
                        resource.getLock().wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                System.out.println(i+ " Even Thread");
                resource.setOddTurn(true);
                resource.getLock().notify();
            }
        }
    }
}
