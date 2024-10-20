package Assignment;

public class Main {
    public static void main(String[] args) {
        // Create a DaftarGaji object to store employees
        DaftarGaji daftarGaji = new DaftarGaji(2);

        // Create a Dosen object and set its SKS
        Dosen dosen1 = new Dosen("12345", "Dr. Budi", "Jakarta");
        dosen1.setSKS(12); // Example of 12 SKS

        // Add the dosen to DaftarGaji
        daftarGaji.addPegawai(dosen1);

        // Create another Pegawai (could be another type of employee)
        Pegawai pegawai2 = new Pegawai("67890", "Siti", "Bandung");

        // Add the pegawai to DaftarGaji
        daftarGaji.addPegawai(pegawai2);

        // Print all salaries
        daftarGaji.printSemuaGaji();
    }
}
