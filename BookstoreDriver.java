package Collections;

public class BookstoreDriver {

    public static void main(String[] args) {
        System.out.println("Book Order Details for Customer:");

        BookOrder customer=new BookOrder("Deepak","TYP00145",452.35);
        System.out.println("Customer Name:"+customer.customerName);
        System.out.println("Customer ID:"+customer.customerId);
        System.out.println("Order Amount:$"+customer.orderAmount);

    }
}
