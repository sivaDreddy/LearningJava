package Collections;

public class BookOrder extends Customer{

    double orderAmount;

    public BookOrder(String customerName, String customerId, double orderAmount) {
        super(customerName, customerId);
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}

