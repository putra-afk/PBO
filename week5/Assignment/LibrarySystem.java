package Assignment;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create an author
        Author author1 = new Author("J.K. Rowling");

        // Create books
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", author1, "978-0747532699");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", author1, "978-0747538493");

        // Add books to the author
        author1.addBook(book1);
        author1.addBook(book2);

        // Create a member
        Member member1 = new Member("Alice", "MEM123");

        // Create a librarian
        Librarian librarian1 = new Librarian("Bob", "LIB456");

        // Librarian manages the borrowing process
        librarian1.manageBook(member1, book1, true);  // Alice borrows the first book
        librarian1.manageBook(member1, book2, true);  // Alice borrows the second book

        // Display member info
        member1.info();

        // Librarian manages the return process
        librarian1.manageBook(member1, book1, false);  // Alice returns the first book

        // Display member info again after returning the book
        member1.info();
    }
}