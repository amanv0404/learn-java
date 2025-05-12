
//Find the order with the highest total item price.

package functional_programming.level7.question2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>(Arrays.asList(
           new Order("01",4500),
           new Order("02",500),
           new Order("03",900),
           new Order("04",7500)
        ));

        Optional<Order> order = orders.stream().max(Comparator.comparingDouble(Order::getTotalPrice));

        order.ifPresent(or->
                System.out.println("Order with higest total: "+or.getTotalPrice())
        );



    }
}
