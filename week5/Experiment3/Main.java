package Experiment3;

public class Main {
    public static void main(String[] args) {
        Employee machinist = new Employee("1234", "Spongebob Squarepants");
        Employee assistant = new Employee("4567", "Patrick Star");
        Railway railway = new Railway("Gaya Baru", "Bisnis", machinist, assistant);
        System.out.println(railway.info());
    }
}
