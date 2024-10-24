package Task;

class Dosen extends Manusia{
    // Overriding the makan method
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin.");
    }

    // Specific method for Dosen
    public void lembur() {
        System.out.println("Dosen sedang lembur.");
    }
}
