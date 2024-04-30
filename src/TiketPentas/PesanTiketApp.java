package TiketPentas;

import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        System.out.print("Masukkan nama pembeli : ");
        String namaPembeli = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2) : ");
        int jenisPembelian = scanner.nextInt();

        if (jenisPembelian != 1 && jenisPembelian != 2) {
            System.out.println("Input tidak valid!");
            System.exit(0);
        }

        String tahap;
        int jenisTiket;
        Tiket tiket = null;

        if (jenisPembelian == 1) {
            tahap = "Presale";

            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2) : ");
            jenisTiket = scanner.nextInt();

            if (jenisTiket == 1) {
                tiket = new VIP(true);
            }
            else if (jenisTiket == 2) {
                tiket = new VVIP(true);
            }
            else {
                System.out.println("Input tidak valid!");
                System.exit(0);
            }
        }

        else {
            tahap = "Reguler";

            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3) : ");
            jenisTiket = scanner.nextInt();

            if (jenisTiket == 1) {
                tiket = new Festival();
            }
            else if (jenisTiket == 2) {
                tiket = new VIP(false);
            }
            else if (jenisTiket == 3) {
                tiket = new VVIP(false);
            }
            else {
                System.out.println("Input tidak valid!");
                System.exit(0);
            }
        }


        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli : ");
        int jumlahTiket = scanner.nextInt();
        System.out.println();

        Pemesanan tiket1 = new Pemesanan(namaPembeli, tahap, tiket, jumlahTiket);
        tiket1.cetakNota();

        scanner.close();

    }
}