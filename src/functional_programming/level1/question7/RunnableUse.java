
//Create a Runnable lambda that prints “Hello Functional Java”.

package functional_programming.level1.question7;

public class RunnableUse {
    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("Hello Functional java");
        new Thread(r).start();
    }
}
