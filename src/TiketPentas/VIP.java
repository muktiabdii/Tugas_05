package TiketPentas;

// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
    
    // Menginisialisasi tiket VIP dengan harga jika presale yaitu 120 dan jika reguler yaitu 150
    public VIP(boolean presale){
        super("VIP", presale? 120 : 150);
    }

    // Membuat method override untuk menghitung harga
    @Override
    public int hitungHarga(int jumlahTiket){
        return harga * jumlahTiket;
    }
}