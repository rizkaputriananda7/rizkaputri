import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Membuat objek Transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan informasi transaksi
            transaksi.displayTransaksi();

        } catch (Exception e) {
            // Menangkap exception umum jika input tidak valid atau terjadi kesalahan lainnya
            System.out.println("Error: Input tidak valid. " + e.getMessage());
        } finally {
            // Menutup Scanner untuk membebaskan sumber daya
            scanner.close();
        }
    }
}
