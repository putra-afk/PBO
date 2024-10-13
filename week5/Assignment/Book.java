package Assignment;

public class Book {
    private String title;
    private Author author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, Author author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true; // book is available by default
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void info() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getName());
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}