
//Problem 5: Product Catalog System (TreeMap, Comparator)
//Create a Product class with id, name, price, rating, and stock.
//        • Store products in a TreeMap<Integer, Product> keyed by id.
//        • Sort and print products by descending rating, and then by name.



package collections;

import java.util.*;

class Product{
    private int id;
    private String name;
    private double price;
    private double rating;
    private int stock;

    public Product(int id, String name, double price, double rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    public void printProduct() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Rating: "+rating);
        System.out.println("Stock: "+stock);
        System.out.println("----------------");
    }
}
public class Problem5 {
    public static void main(String[] args) {

        TreeMap<Integer, Product> productMap = new TreeMap<>();

        productMap.put(101, new Product(101, "Laptop", 55000, 4.5, 12));
        productMap.put(102, new Product(102, "Smartphone", 25000, 4.7, 50));
        productMap.put(103, new Product(103, "Headphones", 1500, 4.2, 100));
        productMap.put(104, new Product(104, "Monitor", 8000, 4.3, 25));
        productMap.put(105, new Product(105, "Keyboard", 1200, 4.7, 60));
        productMap.put(106, new Product(106, "Mouse", 700, 4.1, 85));
        productMap.put(107, new Product(107, "Tablet", 18000, 4.3, 30));


        // convert values to list and sort
        List<Product> productList = new ArrayList<>(productMap.values());

        productList.sort(
                Comparator.comparingDouble(Product::getRating).reversed()
                        .thenComparing(Product::getName)
        );

        System.out.println("Sorted Product Catalog ");
        for (Product p : productList) {
            p.printProduct();
        }

    }
}
