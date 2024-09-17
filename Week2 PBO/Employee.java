public class Employee {
    // Attributes of the Employee class
    private int empId;
    private String name;
    private String gender;
    private String title;
    private double salary;

    // Constructor to initialize Employee attributes
    public Employee(int empId, String name, String gender, String title, double salary) {
        this.empId = empId;
        this.name = name;
        this.gender = gender;
        this.title = title;
        this.salary = salary;
    }

    // Method to view personal data of the employee
    public void viewPersonalData() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Title: " + title);
    }

    // Method to view the salary of the employee
    public void viewSalary() {
        System.out.println("Salary: " + salary);
    }

    // Main method to demonstrate the Employee class
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee employee1 = new Employee(1, "John Doe", "Male", "Software Engineer", 75000.0);

        // Viewing personal data
        employee1.viewPersonalData();

        // Viewing salary
        employee1.viewSalary();
    }
}
