public class ElectronicDevice {
    private String brand;
    private String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void powerOn() {
        System.out.println(brand + " " + model + " is now powered on.");
    }

    public void powerOff() {
        System.out.println(brand + " " + model + " is now powered off.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}