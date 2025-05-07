package functional_programming.level10.question3;

import java.time.LocalDate;

public class Order {
    private int id;
    private LocalDate date;
    private double amount;

    public Order(int id, LocalDate date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}
