package functional_programming.level9.question1;

public class Book {
    private String name;
    private double rating;
    private double price;

    public Book(String name, double rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
