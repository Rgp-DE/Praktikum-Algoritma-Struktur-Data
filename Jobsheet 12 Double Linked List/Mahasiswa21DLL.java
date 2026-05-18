public class Mahasiswa21DLL {
    String nim;
    String nama;
    String prodi;
    double ipk;

    public Mahasiswa21DLL() {
    }

    public Mahasiswa21DLL(String nim, String nama, String prodi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + ipk);
    }
}
