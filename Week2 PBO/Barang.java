public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    int hargaJual;

    public void hitungHargaJual() {
        hargaJual = hargaDasar - (int)(diskon / 100 * hargaDasar);
    }

    public void tampilData() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Jual: " + hargaJual);
    }

    public static void main(String[] args) {
        Barang barang = new Barang();
        barang.kode = "B001";
        barang.namaBarang = "Laptop";
        barang.hargaDasar = 10000000;
        barang.diskon = 10;
        barang.hitungHargaJual();
        barang.tampilData();
    }
}
