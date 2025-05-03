package multithreading.assignment1;

public class Resource {
    private final Object lock = new Object();
    private boolean isOddTurn = true;

    public Object getLock() {
        return lock;
    }

    public boolean isOddTurn() {
        return isOddTurn;
    }

    public void setOddTurn(boolean oddTurn) {
        isOddTurn = oddTurn;
    }

}
