public class Surat21 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; 
    int durasi;

    public Surat21() {}

    public Surat21(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampil() {
        System.out.println("ID: " + idSurat +
                " | Nama: " + namaMahasiswa +
                " | Kelas: " + kelas +
                " | Jenis: " + jenisIzin +
                " | Durasi: " + durasi + " hari");
    }
}