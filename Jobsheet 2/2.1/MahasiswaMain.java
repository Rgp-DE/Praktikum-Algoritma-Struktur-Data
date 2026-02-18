public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa21 mahasiswa1 = new Mahasiswa21();
        mahasiswa1.nama = "Muhammad Ali Farhan";
        mahasiswa1.nim = "2541070645";
        mahasiswa1.kelas = "SIB 1B";
        mahasiswa1.ipk = 3.7;

        mahasiswa1.tampilkanInfo();
        mahasiswa1.ubahKelas("SIB 1A");
        mahasiswa1.updateIPK(3.8);
        mahasiswa1.tampilkanInfo();

        Mahasiswa21 mahasiswa2 = new Mahasiswa21("Siti Nur Aisyah", "2541070646", 3.6, "SIB 1B");
        mahasiswa2.updateIPK(3.9);
        mahasiswa2.tampilkanInfo();

    }
    
}
