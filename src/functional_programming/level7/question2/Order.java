package functional_programming.level7.question2;

public class Order {
    private String orderId;
    private float totalPrice;

    public Order(String orderId,float totalPrice) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
}
