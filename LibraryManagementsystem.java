package Collections;

import java.util.Scanner;

public class LibraryManagementsystem {
    public static void main(String[] args) {
        System.out.println("Library Management System");
        System.out.println("=========================");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book title:");
        String title=sc.nextLine();
        System.out.println("Enter Book Author:");
        String author=sc.nextLine();
        System.out.println("Enter book ISBN:");
        String ISBNNumber=sc.nextLine();
        System.out.println("Publication Date");
        String date=sc.nextLine();

       Book book=new Book(author,ISBNNumber,date,title);
       book.displayBookDetails();



    }
}
