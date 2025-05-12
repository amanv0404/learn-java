
//Given a list of products with category and rating, return a map of category → highest-rated product name.

package functional_programming.level7.question3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(Arrays.asList(
                new Product("iPhone", "Electronics", 4.6),
                new Product("Galaxy", "Electronics", 4.3),
                new Product("Banana", "Fruits", 4.8),
                new Product("Apple", "Fruits", 4.4),
                new Product("Sony TV", "Electronics", 4.9)
        ));

        Map<String,String> bestRatedByCategory = list.stream().
                collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                optProduct->optProduct.map(Product::getName).orElse("NA")
                        )
                ));

        bestRatedByCategory.forEach((category, productName) ->
                System.out.println(category + " → " + productName)
        );
    }
}
