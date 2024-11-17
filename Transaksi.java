//class turunan dari class Barang dengan menggunakan Inheritance
class Transaksi extends Barang {
    int jumlahBeli;
    String noFaktur;

    // Constructor untuk menginisialisasi properti transaksi dan memanggil constructor induk
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor dari kelas induk (Barang)
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    // Method untuk menghitung total harga dengan exception handling
    public double hitungTotal() throws ArithmeticException {
        // Exception handling untuk memastikan jumlah beli dan harga tidak negatif
        if (jumlahBeli < 0 || hargaBarang < 0) {
            throw new ArithmeticException("Jumlah beli dan harga barang tidak boleh negatif.");
        }
        return jumlahBeli * hargaBarang;
    }

    // Method untuk menampilkan informasi transaksi
public void displayTransaksi() {
    System.out.println("\n===== Detail Transaksi =====");
    System.out.println("No Faktur      : " + noFaktur);
    System.out.println("Kode Barang    : " + kodeBarang);
    System.out.println("Nama Barang    : " + namaBarang);
    System.out.println("Harga Barang   : " + hargaBarang);
    System.out.println("Jumlah Beli    : " + jumlahBeli);
    try {
        // Mencoba menghitung total harga
        double totalHarga = hitungTotal();
        System.out.println("Total Harga    : " + totalHarga);
    } catch (ArithmeticException e) {
        // Menangkap exception jika ada kesalahan perhitungan
        // Ini bisa terjadi jika jumlah beli atau harga negatif
        System.out.println("Error: " + e.getMessage()); // Menampilkan pesan error jika ada exception
    }
    System.out.println("============================");
    System.out.println("Terima kasih telah berbelanja!");
}


}