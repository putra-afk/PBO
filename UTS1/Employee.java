import java.util.List;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void prepareFood(Food food) {
        System.out.println(name + " is preparing " + food.getName() + "...");
        // Simulate cooking time (reduced for demonstration)
        try {
            Thread.sleep(food.getCookingTime() * 15); // Speed up cooking time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(food.getName() + " is ready!");
    }
}
