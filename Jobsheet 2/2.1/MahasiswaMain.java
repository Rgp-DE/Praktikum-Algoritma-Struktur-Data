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
       
    }
    
}
