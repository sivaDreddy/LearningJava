package Collections;

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        System.out.println("Add product to cart");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

      Product product=new Product();
      product.id=101;
      product.name="Laptop";
      product.price=100;


    }
}
