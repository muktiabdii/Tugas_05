package TiketPentas;

// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    
    public Festival(){
        super("Festival", 100);
    }

    @Override
    public int hitungHarga(int jumlahTiket){
        return harga * jumlahTiket;
    }
}