public class SepedaGunung extends Sepeda {
    
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }

    public void printStatus() {
        super.printStatus();
        System.out.println("Tipe Suspensi: " + tipeSuspensi);
    }
}