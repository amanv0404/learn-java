package functional_programming.level7.question3;

public class Product {
    String name;
    String category;
    double rating;

    public Product(String name, String category, double rating) {
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}
