import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String name;
    private List<Food> chosenFoods = new ArrayList<>(); // Changed to List<Food>
    private int patienceLevel;
    private int tableNumber;
    private boolean isTakeAway;

    public Customer(String name, int patienceLevel) {
        this.name = name;
        this.patienceLevel = patienceLevel;
    }

    public String getName() {
        return name;
    }

    public void chooseFood(List<Food> menu) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi " + name + "! Please choose your food from the menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
        
        while (true) {
            System.out.print("Enter the number of the food you'd like to order (or 0 to finish): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break; // Exit ordering loop
            }
            chosenFoods.add(menu.get(choice - 1));
            System.out.println(name + " ordered: " + menu.get(choice - 1).getName());
        }
    }

    public void setDiningOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to eat here or take away? (Enter 1 for Eat Here, 2 for Take Away): ");
        int option = scanner.nextInt();
        if (option == 1) {
            isTakeAway = false;
            System.out.print("Please enter your table number: ");
            tableNumber = scanner.nextInt();
        } else {
            isTakeAway = true;
        }
    }

    public boolean isTakeAway() {
        return isTakeAway;
    }

    public List<Food> getChosenFoods() { // Changed return type
        return chosenFoods;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return String.format("Customer: %s (Patience: %d)", name, patienceLevel);
    }
}
