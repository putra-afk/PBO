public class DigitalWatch extends ElectronicDevice {
    private String currentTime;
    private boolean alarmSet;

    public DigitalWatch(String brand, String model, String currentTime, boolean alarmSet) {
        super(brand, model);
        this.currentTime = currentTime;
        this.alarmSet = alarmSet;
    }

    public void setTime(String time) {
        currentTime = time;
        System.out.println("Time set to " + currentTime);
    }

    public void toggleAlarm() {
        alarmSet = !alarmSet;
        System.out.println("Alarm is now " + (alarmSet ? "set" : "off"));
    }

    // Overriding displayInfo method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Current Time: " + currentTime + ", Alarm Set: " + alarmSet);
    }
}