package Tugas;

public class MahasiswaLL00 {
    String nim;
    String nama;
    String jurusan;

    public MahasiswaLL00(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println(
                nim + " - " +
                nama + " - " +
                jurusan);
    }
}