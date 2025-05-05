//## Assignment 3: Odd-Even Printer
//### Background:
//Create a coordinated printing system where two threads print odd and even numbers up to 100 in sequence.
//        ### Requirements:
//
//        - Thread A prints odd numbers (1, 3, 5...)
//        - Thread B prints even numbers (2, 4, 6...)
//        - Output must be in order: 1 2 3 4 5 ... 100
//        - Use `wait()` and `notify()` for coordination

package multithreading.assignment3;

public class Main {

    public static void main(String[] args) {
        Resource r1 = new Resource();

        EvenThread t1 = new EvenThread(r1);
        OddThread t2 = new OddThread(r1);

        t1.start();
        t2.start();
    }

}