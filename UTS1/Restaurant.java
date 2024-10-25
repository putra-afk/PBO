import java.util.*;

public class Restaurant {
    private String name;
    private Queue<Customer> customers = new LinkedList<>();
    private List<Food> menu = new ArrayList<>();
    private Map<String, Integer> foodStock = new HashMap<>();
    private Map<String, Integer> ingredientStock = new HashMap<>();
    private Employee employee; // Added employee

    public Restaurant(String name) {
        this.name = name;
        this.employee = new Employee("Chef Hammam"); // Create a chef
    }

    public void addFood(Food food, int stockQuantity, int ingredientStockQuantity) {
        menu.add(food);
        foodStock.put(food.getName(), stockQuantity);
        for (String ingredient : food.getIngredients()) {
            ingredientStock.put(ingredient, ingredientStockQuantity);
        }
    }

    public void displayMenu() {
        System.out.println("\n╔═══════════════════════════╗");
        System.out.println("        🍔 MENU 🍟        ");
        System.out.println("╚═══════════════════════════╝");
        for (Food food : menu) {
            System.out.println(food);
        }
        System.out.println("═════════════════════════════");
    }

    public void welcomeMessage() {
        System.out.println("**********************************************");
        System.out.println("        Selamat Datang di " + name + "!");
        System.out.println("**********************************************\n");
        System.out.println("Kami senang melayani Anda. Berikut menu kami:");
        displayMenu();
    }

    public void simulateCustomerArrival(String customerName) {
        Random random = new Random();
        int patience = random.nextInt(10) + 1; // Random patience level
        Customer customer = new Customer(customerName, patience);
        System.out.println(customer + " telah tiba!");
        customer.chooseFood(menu);
        customer.setDiningOption();
        customers.add(customer);
    }

    public void processOrder() {
        if (customers.isEmpty()) {
            System.out.println("Tidak ada pelanggan yang harus dilayani.");
            return;
        }

        Customer customer = customers.poll();
        System.out.println("\n--- Memproses Pesanan untuk " + customer + " ---");
        List<Food> orderedFoods = customer.getChosenFoods(); // Get multiple foods

        for (Food orderedFood : orderedFoods) {
            // Cek stok makanan dan bahan
            if (foodStock.get(orderedFood.getName()) > 0) {
                boolean canPrepare = true;
                for (String ingredient : orderedFood.getIngredients()) {
                    if (ingredientStock.get(ingredient) <= 0) {
                        canPrepare = false;
                        System.out.println("Maaf, stok bahan habis: " + ingredient);
                        break;
                    }
                }

                if (canPrepare) {
                    foodStock.put(orderedFood.getName(), foodStock.get(orderedFood.getName()) - 1);
                    for (String ingredient : orderedFood.getIngredients()) {
                        ingredientStock.put(ingredient, ingredientStock.get(ingredient) - 1);
                    }
                    // Call employee to prepare food
                    employee.prepareFood(orderedFood);

                    // Inform customer about delivery
                    if (customer.isTakeAway()) {
                        System.out.println("Makanan " + orderedFood.getName() + " telah dikemas untuk dibawa pulang. Terima kasih!");
                    } else {
                        System.out.println("Makanan " + orderedFood.getName() + " akan diantar ke meja nomor " + customer.getTableNumber() + ".");
                    }
                } else {
                    System.out.println("Maaf, " + orderedFood.getName() + " tidak dapat diproses.");
                }
            } else {
                System.out.println("Maaf, " + orderedFood.getName() + " sudah habis.");
            }
        }

        // Proses pembayaran
        cashier(customer);
    }

    public void cashier(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;
        for (Food food : customer.getChosenFoods()) { // Calculate total for all foods
            totalPrice += food.getPrice();
        }
        System.out.println("\n--- Kasir ---");
        System.out.println("Total yang harus dibayar: Rp" + String.format("%,.0f", totalPrice));
        System.out.print("Masukkan jumlah pembayaran: Rp");
        double payment = scanner.nextDouble();

        if (payment >= totalPrice) {
            double change = payment - totalPrice;
            System.out.println("Pembayaran berhasil! Kembalian Anda: Rp" + String.format("%,.0f", change));
            generateReceipt(customer, payment, change);
        } else {
            System.out.println("Uang tidak mencukupi. Silakan coba lagi.");
        }
    }

    public void generateReceipt(Customer customer, double payment, double change) {
        System.out.println("\n--- Nota Transaksi ---");
        System.out.println("Pelanggan: " + customer.getName());
        if (!customer.isTakeAway()) {
            System.out.println("Nomor Meja: " + customer.getTableNumber());
        } else {
            System.out.println("Jenis Pesanan: Take Away");
        }
        System.out.println("Pesanan: ");
        for (Food food : customer.getChosenFoods()) {
            System.out.println("- " + food.getName());
        }
        System.out.println("Total Dibayar: Rp" + String.format("%,.0f", payment));
        System.out.println("Kembalian: Rp" + String.format("%,.0f", change));
        System.out.println("Terima kasih telah berkunjung!");
    }

    public void manageStock() {
        System.out.println("\n--- Stok Makanan dan Bahan ---");
        System.out.println("Stok Makanan:");
        for (Map.Entry<String, Integer> entry : foodStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " tersisa");
        }

        System.out.println("\nStok Bahan:");
        for (Map.Entry<String, Integer> entry : ingredientStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unit tersisa");
        }
        System.out.println();
    }
}
