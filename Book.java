package Collections;

import java.time.LocalDate;

public class Book extends LibraryItem {
    public Book(String author, String ISBNNumber, String publicationDate, String title) {
        super(author, ISBNNumber, publicationDate, title);
    }
//added book classes
//add new lines in book class file


    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("book title :"+getTitle());
        System.out.println("book author :"+getAuthor());
        System.out.println("book ISBN :"+getISBNNumber());
        System.out.println("book publication date :"+getPublicationDate());
    }


}
