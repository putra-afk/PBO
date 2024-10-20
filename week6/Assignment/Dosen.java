package Assignment;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private static final int TARIF_SKS = 150000; // Example tariff for SKS

    // Constructor for Dosen
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat); // Call the constructor of Pegawai
    }

    // Method to set the number of SKS
    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    // Override getGaji method
    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}

// Class DaftarGaji (Salary List)
class DaftarGaji {
    private Pegawai[] listPegawai;
    private int currentIndex = 0;

    // Constructor to initialize the list
    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    // Method to add a Pegawai to the list
    public void addPegawai(Pegawai pegawai) {
        if (currentIndex < listPegawai.length) {
            listPegawai[currentIndex] = pegawai;
            currentIndex++;
        }
    }

    // Method to print all salaries
    public void printSemuaGaji() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() +
                               ", Gaji: " + listPegawai[i].getGaji());
        }
    }
}