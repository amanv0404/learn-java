package functional_programming.level9.question1;

public class BookSummary {
    private long totalCount;
    private double averageRating;
    private double totalPrice;

    public BookSummary(long totalCount, double averageRating, double totalPrice) {
        this.totalCount = totalCount;
        this.averageRating = averageRating;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "BookSummary{" +
                "totalCount=" + totalCount +
                ", averageRating=" + averageRating +
                ", totalPrice=" + totalPrice +
                '}';
    }

}
