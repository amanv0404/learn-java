
//Implement a function pipeline to process orders (e.g., filter by status, sort by amount, map to customer name).

package functional_programming.level5.question2;

import java.util.*;

public class OrderProcessing {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>(Arrays.asList(
                new Order("Aman","DELIVERED",5000),
                new Order("Yash","PENDING",2000),
                new Order("Ironman","DELIVERED",1000),
                new Order("Spiderman","CANCELLED",500)
        ));

        List<String> customerNames = orders.stream().
                filter(order -> "DELIVERED".equals(order.status)).
                sorted(Comparator.comparingDouble(order->order.amount)).
                map(order->order.customerName).toList();

        System.out.println("Delivered Orders: " + customerNames);


    }
}
