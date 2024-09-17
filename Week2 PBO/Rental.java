public class Rental {
    int id;
    String memberName;
    String gameName;
    double pricePerDay;
    int rentalDuration;
    double totalAmount;

    public void calculateAmount() {
        totalAmount = pricePerDay * rentalDuration;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Price Per Day: " + pricePerDay);
        System.out.println("Rental Duration (days): " + rentalDuration);
        System.out.println("Total Amount to Pay: " + totalAmount);
    }

    public static void main(String[] args) {
        Rental rental = new Rental();
        rental.id = 1;
        rental.memberName = "John Doe";
        rental.gameName = "FIFA 2024";
        rental.pricePerDay = 5.0;
        rental.rentalDuration = 3;
        rental.calculateAmount();
        rental.displayDetails();
    }
}