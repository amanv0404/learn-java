
// Given a list of books, generate a summary object with total count, average rating, and total price.

package functional_programming.level9.question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("Book A", 400.0, 4.5),
                new Book("Book B", 300.0, 4.2),
                new Book("Book C", 250.0, 4.8)
        ));

        long count = books.size();
        double totalPrice = books.stream().mapToDouble(Book::getPrice).sum();
        double avgRating = books.stream().mapToDouble(Book::getRating).average().orElse(0.0);

        BookSummary summary = new BookSummary(count,avgRating,totalPrice);
        System.out.println(summary);
    }
}
