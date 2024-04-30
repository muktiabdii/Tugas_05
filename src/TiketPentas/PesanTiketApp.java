package TiketPentas;

import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Memasukkan nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        String namaPembeli = scanner.nextLine();

        // Memasukkan tahap pembelian
        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2) : ");
        int jenisPembelian = scanner.nextInt();

        // Mengidentifikasi jenis pembelian
        if (jenisPembelian != 1 && jenisPembelian != 2) {
            System.out.println("Input tidak valid!");
            System.exit(0);
        }

        // Mendeklarasikan tahap, jenisTiket, dan objek tiket dengan nilai awal null
        String tahap;
        int jenisTiket;
        Tiket tiket = null;

        // Membuat if jika jenis pembelian adalah presale
        if (jenisPembelian == 1) {
            tahap = "Presale";

            // Memilih jenis tiket
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2) : ");
            jenisTiket = scanner.nextInt();

            // Memanggil kelas VIP dengan tahap presale
            if (jenisTiket == 1) {
                tiket = new VIP(true);
            }

            // Memanggil kelas VVIP dengan tahap presale
            else if (jenisTiket == 2) {
                tiket = new VVIP(true);
            }

            // Mengidentifikasi jenis tiket
            else {
                System.out.println("Input tidak valid!");
                System.exit(0);
            }
        }

        // Membuat else jika jenis pembelian adalah reguler
        else {
            tahap = "Reguler";

            // Memilih jensi tiket
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3) : ");
            jenisTiket = scanner.nextInt();

            // Memanggil kelas festival
            if (jenisTiket == 1) {
                tiket = new Festival();
            }

            // Memanggil kelas VIP dengan tahap reguler
            else if (jenisTiket == 2) {
                tiket = new VIP(false);
            }

            // Memanggil kelas VVIP dengan tahap reguler
            else if (jenisTiket == 3) {
                tiket = new VVIP(false);
            }

            // Mengidentifikasi jenis tiket
            else {
                System.out.println("Input tidak valid!");
                System.exit(0);
            }
        }

        // Memasukkan jumlah tiket
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli : ");
        int jumlahTiket = scanner.nextInt();
        System.out.println();

        // Membuat objek baru bernama tiket1 dengan kelas Pemesanan
        Pemesanan tiket1 = new Pemesanan(namaPembeli, tahap, tiket, jumlahTiket);
        tiket1.cetakNota(); // Memanggil method cetak nota

        // Menutup scanner
        scanner.close();

    }
}