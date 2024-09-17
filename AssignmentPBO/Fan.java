public class Fan extends ElectronicDevice {
    private int speedLevel;
    private String mode;

    public Fan(String brand, String model, int speedLevel, String mode) {
        super(brand, model);
        this.speedLevel = speedLevel;
        this.mode = mode;
    }

    public void increaseSpeed() {
        speedLevel++;
        System.out.println("Fan speed increased to level " + speedLevel);
    }

    public void changeMode() {
        System.out.println("Changing mode to " + mode);
    }

    // Overriding displayInfo method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Speed Level: " + speedLevel + ", Mode: " + mode);
    }
}