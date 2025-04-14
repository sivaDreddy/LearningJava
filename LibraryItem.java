package Collections;

import java.time.LocalDate;

public class LibraryItem {
    private String title;
    private String author;
    private String publicationDate;
    private String ISBNNumber;

    public LibraryItem(String author, String ISBNNumber, String publicationDate, String title) {
        this.author = author;
        this.ISBNNumber = ISBNNumber;
        this.publicationDate = publicationDate;
        this.title = title;
    }
public void displayBookDetails(){

}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
