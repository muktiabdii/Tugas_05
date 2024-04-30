package TiketPentas;

// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    protected String jenis;
    protected int harga;

    Tiket(String jenis, int harga){
        this.jenis = jenis;
        this.harga = harga;
    }

    // Membuat method abstrak untuk menghitung harga
    public abstract int hitungHarga(int jumlahTiket);

    // Membuat getter untuk mereturn jenis
    public String getJenis(){
        return jenis;
    }

    // Membuat getter untuk mereturn harga
    public int getHarga(){
        return harga;
    }
}