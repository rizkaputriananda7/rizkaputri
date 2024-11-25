import java.text.SimpleDateFormat; // Untuk format tanggal dan waktu
import java.util.Date; // Untuk mendapatkan tanggal dan waktu saat ini
import java.util.Scanner; // Untuk input dari pengguna

public class Supermarket {

    // Method untuk menampilkan header login
    public static void displayLoginHeader() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("                     LOG IN                            ");
        System.out.println("+-----------------------------------------------------+");
    }

    // Method utama untuk login
    public static boolean login(String usernameInput, String passwordInput, String captchaInput) {
        // Username dan password default untuk validasi
        String username = "pulu";
        String password = "54321";
        String captcha = "ABCD";

        // Validasi input menggunakan metode String
        if (usernameInput.equals(username) && passwordInput.equals(password) && captchaInput.equalsIgnoreCase(captcha)) {
            System.out.println("Login berhasil! Selamat datang.");
            return true; // Login berhasil
        } else {
            System.out.println("Login gagal. Silakan coba lagi.");
            return false; // Login gagal
        }
    }

    // Method untuk menampilkan tanggal dan waktu saat ini
    public static String getCurrentDateTime() {
        // Membuat objek Date untuk mendapatkan waktu saat ini
        Date date = new Date();
        // Menggunakan SimpleDateFormat untuk memformat waktu ke bentuk yang lebih manusiawi
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return dateFormat.format(date); // Mengembalikan waktu dalam format yang ditentukan
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            displayLoginHeader(); // Menampilkan header login

            // Input dari pengguna untuk login
            System.out.print("Username : ");
            String usernameInput = scanner.nextLine();

            System.out.print("Password : ");
            String passwordInput = scanner.nextLine();

            System.out.print("Captcha  : ");
            String captchaInput = scanner.nextLine();

            // Memanggil method login untuk validasi
            isLoggedIn = login(usernameInput, passwordInput, captchaInput);
        }

        boolean ulangiTransaksi = true;
        while (ulangiTransaksi) {
            // Setelah login berhasil, menampilkan selamat datang
            System.out.println("+----------------------------------------------------+");
            System.out.println("        Selamat Datang di Supermarket Chocoreo      ");
            System.out.println("Tanggal dan Waktu : " + getCurrentDateTime());
            System.out.println("+----------------------------------------------------+");

            try {
                // Input detail transaksi
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
                scanner.nextLine(); // Mengonsumsi newline setelah input integer

                // Menghitung total
                double totalHarga = hargaBarang * jumlahBeli;

                // Menampilkan detail transaksi
                System.out.println("+----------------------------------------------------+");
                System.out.println("No. Faktur      : " + noFaktur);
                System.out.println("Kode Barang     : " + kodeBarang);
                System.out.println("Nama Barang     : " + namaBarang);
                System.out.println("Harga Barang    : " + hargaBarang);
                System.out.println("Jumlah Beli     : " + jumlahBeli);
                System.out.println("TOTAL           : " + totalHarga);
                System.out.println("+----------------------------------------------------+");
                System.out.println("Kasir : rizkaputri"); // Kasir tetap
                System.out.println("+----------------------------------------------------+");

                // Menanyakan apakah ingin melakukan transaksi lain
                System.out.print("Apakah Anda ingin melakukan transaksi lain? (ya/tidak): ");
                String pilihan = scanner.nextLine().trim().toLowerCase();

                if (!pilihan.equals("ya")) {
                    ulangiTransaksi = false; // Keluar dari loop transaksi
                }

            } catch (Exception e) {
                // Menangani error input
                System.out.println("Error: Input tidak valid. " + e.getMessage());
                scanner.nextLine(); // Membersihkan buffer input
            }
        }

        System.out.println("Terima kasih telah berbelanja di Supermarket SuperKeren!");
        // Menutup Scanner untuk membebaskan sumber daya
        scanner.close();
    }
}
