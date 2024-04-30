package TiketPentas;

// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {

    // Menginisialisasi tiket VVIP dengan harga jika presale yaitu 160 dan jika reguler yaitu 200
    VVIP(boolean presale){
        super("VVIP", presale? 160 : 200);
    }

    // Membuat method override untuk menghitung harga
    @Override
    public int hitungHarga(int jumlahTiket){
        return harga * jumlahTiket;
    }
}