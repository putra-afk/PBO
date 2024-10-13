package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> booksWritten;

    public Author(String name) {
        this.name = name;
        this.booksWritten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        booksWritten.add(book);
    }

    public List<Book> getBooks() {
        return booksWritten;
    }

    public void info() {
        System.out.println("Author Name: " + name);
        System.out.println("Books Written: ");
        for (Book book : booksWritten) {
            System.out.println(" - " + book.getTitle());
        }
    }
}