package Task;

class Mahasiswa extends Manusia {
    // Overriding the makan method
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di warung.");
    }

    // Specific method for Mahasiswa
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur.");
    }
}
