package Collections;

import java.util.Scanner;

public class PalindromeAlterway {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

            String sb = new StringBuilder(str).reverse().toString();
        if (str.equals(sb)) {
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not a palindrome");
        }

    }


}
