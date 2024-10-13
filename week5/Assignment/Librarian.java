package Assignment;

public class Librarian {
    private String name;
    private String employeeId;

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void manageBook(Member member, Book book, boolean isBorrowing) {
        if (isBorrowing) {
            member.borrowBook(book);
        } else {
            member.returnBook(book);
        }
    }

    public void info() {
        System.out.println("Librarian Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}