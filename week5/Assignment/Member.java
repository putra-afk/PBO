package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String membershipId;
    private List<Book> borrowedBooks;

    public Member(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " has not borrowed " + book.getTitle());
        }
    }

    public void info() {
        System.out.println("Member Name: " + name);
        System.out.println("Membership ID: " + membershipId);
        System.out.println("Borrowed Books: ");
        for (Book book : borrowedBooks) {
            System.out.println(" - " + book.getTitle());
        }
    }
}