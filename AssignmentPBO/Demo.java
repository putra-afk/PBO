public class Demo {
    public static void main(String[] args) {
        Speakers jblSpeaker = new Speakers("JBL", "Charge 4", 50, "5.0");
        Fan krisbowFan = new Fan("Krisbow", "KWF123", 3, "Sleep");
        PowerBank redmiPowerBank = new PowerBank("Redmi", "10000mAh", 10000, 75);
        DigitalWatch redmiWatch = new DigitalWatch("Redmi", "SmartWatch", "12:30 PM", false);

        jblSpeaker.displayInfo();
        jblSpeaker.increaseVolume();
        jblSpeaker.connectBluetooth();

        System.out.println();

        krisbowFan.displayInfo();
        krisbowFan.increaseSpeed();
        krisbowFan.changeMode();

        System.out.println();

        redmiPowerBank.displayInfo();
        redmiPowerBank.chargeDevice();
        redmiPowerBank.rechargePowerBank();

        System.out.println();

        redmiWatch.displayInfo();
        redmiWatch.setTime("06:45 AM");
        redmiWatch.toggleAlarm();
    }
}