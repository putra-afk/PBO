import java.util.List;

public class Food {
    private String name;
    private double price;
    private List<String> ingredients;
    private int cookingTime;  // in seconds

    public Food(String name, double price, List<String> ingredients, int cookingTime) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    @Override
    public String toString() {
        return String.format("%-15s Rp%,.0f (Waktu Masak: %d menit)", name, price, cookingTime / 60);
    }
}
