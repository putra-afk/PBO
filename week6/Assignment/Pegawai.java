package Assignment;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;

    // Constructor
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Method to get the name of the employee
    public String getNama() {
        return this.nama;
    }

    // Method to get the salary (to be overridden by subclasses)
    public int getGaji() {
        return 0; // Base class returns 0 as salary
    }
}