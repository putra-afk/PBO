package Task;

public class Main {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Manusia manusia;

        // Manusia reference pointing to a Dosen object
        manusia = new Dosen();
        manusia.bernafas();
        manusia.makan();  // Calls Dosen's makan method

        // Manusia reference pointing to a Mahasiswa object
        manusia = new Mahasiswa();
        manusia.bernafas();
        manusia.makan();  // Calls Mahasiswa's makan method
    }
}