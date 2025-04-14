package Collections;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //System.out.print("Enter a string: ");
        //String s = input.nextLine();
        String word="siva";
        boolean palin= palindrome(word);

       if(palin){
           System.out.println("Palindrome word: "+word);
       }else{
           System.out.println("Not a palindrome");
       }

    }

    private static boolean palindrome(String str) {

        str=str.replaceAll("\\s+", "").toLowerCase();
        String builder = new StringBuilder(str).reverse().toString();
        return str.equals(builder);
    }
}
