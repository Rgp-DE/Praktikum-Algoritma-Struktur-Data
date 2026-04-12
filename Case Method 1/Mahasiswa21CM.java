public class Mahasiswa21CM {
    String nim;
    String nama;
    String prodi;

    Mahasiswa21CM(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMhs() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}