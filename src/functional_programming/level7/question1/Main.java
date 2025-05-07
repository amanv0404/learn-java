
//You have a list of Order objects, each with a list of Items. Return a flat list of all item names.

package functional_programming.level7.question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>(Arrays.asList(
                new Order(Arrays.asList(new Item("Book"), new Item("Pen"))),
                new Order(Arrays.asList(new Item("Notebook"), new Item("Pencil"))),
                new Order(Arrays.asList(new Item("Pen"), new Item("Eraser")))
        ));

        List<String> itemNames = orders.stream().
                flatMap(order->order.getItems().stream()).
                map(Item::getName).toList();

        System.out.println("All item names: "+itemNames);


    }
}
