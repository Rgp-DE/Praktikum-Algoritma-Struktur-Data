public class Mahasiswa21CM {
    String nim;
    String nama;
    String prodi;
    String noHp;

    Mahasiswa21CM(String nim, String nama, String prodi, String noHp) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.noHp = noHp;
    }

    void tampilMhs() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi + " | NO HP: " + noHp);
    }
}