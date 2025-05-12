

// Chain operations on a list of Orders: filter by date range, map to total amount, sum all totals.

package functional_programming.level10.question3;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, LocalDate.of(2025, 1, 10), 150.0),
                new Order(2, LocalDate.of(2025, 2, 15), 200.0),
                new Order(3, LocalDate.of(2025, 3, 20), 180.0),
                new Order(4, LocalDate.of(2025, 4, 25), 300.0)
        );

        LocalDate start = LocalDate.of(2025, 2, 1);
        LocalDate end = LocalDate.of(2025, 3, 31);

        double totalInRange = orders.stream().filter(order->!order.getDate().isBefore(start) && !order.getDate().isAfter(end)).
                mapToDouble(Order::getAmount).sum();

        System.out.println("Total in date range: " + totalInRange);



    }
}
