import java.util.Arrays;
import java.util.Scanner;

public class RestaurantSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the restaurant
        Restaurant restaurant = new Restaurant("Fast Food Paradise");

        // Add food items to the menu
        Food burger = new Food("Burger", 59000, Arrays.asList("bun", "meat", "lettuce"), 300);  // Rp 59,000, 5 minutes
        Food fries = new Food("Fries", 29900, Arrays.asList("potato", "salt"), 180);  // Rp 29,900, 3 minutes
        Food drink = new Food("Drink", 19900, Arrays.asList("water", "syrup"), 60);   // Rp 19,900, 1 minute

        restaurant.addFood(burger, 10, 10);
        restaurant.addFood(fries, 20, 20);
        restaurant.addFood(drink, 15, 15);

        // Welcome message and menu display
        restaurant.welcomeMessage();

        // Continuous operation loop
        while (true) {
            // Simulate customer arrival and interaction
            System.out.print("Masukkan nama Anda, pelanggan (atau ketik 'exit' untuk keluar): ");
            String customerName = scanner.nextLine();

            if (customerName.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih sudah berkunjung! Sampai jumpa di lain waktu!");
                break; // Exit the loop if the user types "exit"
            }

            // Simulate customer arrival and order
            restaurant.simulateCustomerArrival(customerName);

            // Check ingredient stock before processing the order
            restaurant.manageStock();

            // Process the order and handle payment
            restaurant.processOrder();
        }

        scanner.close();
    }
}