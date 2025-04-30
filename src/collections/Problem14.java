
//Problem 14: Restaurant Order System (Deque, List)
//        Use a Deque<Order> for managing current orders.
//        • Allow adding/removing orders from both ends.
//        • Store history in a List<Order>.


package collections;
import java.util.*;


class Order {
    private static int count = 1;
    private final int orderId;
    private final String item;

    public Order(String item) {
        this.orderId = count++;
        this.item = item;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Order " + orderId + ": " + item;
    }
}
public class Problem14 {

    public static void main(String[] args) {
        Deque<Order> currentOrders = new ArrayDeque<>();
        List<Order> orderHistory = new ArrayList<>();

        currentOrders.addLast(new Order("Pizza"));
        currentOrders.addLast(new Order("Burger"));
        currentOrders.addFirst(new Order("Pasta")); // priority

        // process orders from front
        while (!currentOrders.isEmpty()) {
            Order completed = currentOrders.removeFirst();
            orderHistory.add(completed);
            System.out.println("Processed: " + completed);
        }

        System.out.println("\nOrder History:");
        for (Order order : orderHistory) {
            System.out.println(order);
        }

    }
}
