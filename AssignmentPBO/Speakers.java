public class Speakers extends ElectronicDevice {
    private int volumeLevel;
    private String bluetoothVersion;

    public Speakers(String brand, String model, int volumeLevel, String bluetoothVersion) {
        super(brand, model);
        this.volumeLevel = volumeLevel;
        this.bluetoothVersion = bluetoothVersion;
    }

    public void increaseVolume() {
        volumeLevel++;
        System.out.println("Volume increased to " + volumeLevel);
    }

    public void connectBluetooth() {
        System.out.println("Connecting via Bluetooth version " + bluetoothVersion);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Volume Level: " + volumeLevel + ", Bluetooth Version: " + bluetoothVersion);
    }
}