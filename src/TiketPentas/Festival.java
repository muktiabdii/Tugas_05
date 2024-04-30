package TiketPentas;

// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    
    // Menginisialisasi tiket festival dengan harga 100
    public Festival(){
        super("Festival", 100);
    }

    // Membuat method override untuk menghitung harga
    @Override
    public int hitungHarga(int jumlahTiket){
        return harga * jumlahTiket;
    }
}