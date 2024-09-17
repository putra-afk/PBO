public class PowerBank extends ElectronicDevice {
    private int capacity;
    private int chargePercentage;

    public PowerBank(String brand, String model, int capacity, int chargePercentage) {
        super(brand, model);
        this.capacity = capacity;
        this.chargePercentage = chargePercentage;
    }

    public void chargeDevice() {
        System.out.println("Charging device with power bank.");
    }

    public void rechargePowerBank() {
        chargePercentage = 100;
        System.out.println("PowerBank is now fully recharged.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity + "mAh, Charge Percentage: " + chargePercentage + "%");
    }
}