public class Buku21 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String penerbit;
    
    Buku21 (String kodeBuku, String judul, int tahunTerbit, String penerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
    }

    void tampilBuku(){
        System.out.println("Kode: " + kodeBuku + "|  Judul: " + judul + "|  Tahun Terbit: " + tahunTerbit + " | Penerbit: " + penerbit);
    }
}
