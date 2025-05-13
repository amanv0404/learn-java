

//Problem 13: Flight Booking Manager (Queue, Map)
//        Use a Queue for booking requests and a Map for confirmed bookings.
//        • Process bookings FIFO and update map with seat numbers.

package collections;
import  java.util.*;


public class Problem13 {
    public static void main(String[] args) {

        Queue<String> bookingQueue = new LinkedList<>();
        Map<String, Integer> confirmedBookings = new HashMap<>();

        bookingQueue.offer("Ravi Kumar");
        bookingQueue.offer("Neha Sharma");
        bookingQueue.offer("Amit Patel");
        bookingQueue.offer("Aman Verma");

        int nextSeatNumber = 1;

        while (!bookingQueue.isEmpty()) {
            String passenger = bookingQueue.poll();
            confirmedBookings.put(passenger, nextSeatNumber++);
        }

        System.out.println("Confirmed Bookings:");
        for (Map.Entry<String, Integer> entry : confirmedBookings.entrySet()) {
            System.out.println(entry.getKey() + " - Seat " + entry.getValue());
        }


    }
}
