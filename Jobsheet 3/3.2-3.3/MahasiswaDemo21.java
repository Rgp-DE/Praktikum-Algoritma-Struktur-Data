public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Mahasiswa21[] arrayOfMahasiswa = new Mahasiswa21[3];
        arrayOfMahasiswa[0] = new Mahasiswa21();
        arrayOfMahasiswa[0].nim = "M1";
        arrayOfMahasiswa[0].nama = "Alucard";
        arrayOfMahasiswa[0].kelas = "TI-1A";
        arrayOfMahasiswa[0].ipk = 3.6f;

        arrayOfMahasiswa[1] = new Mahasiswa21();
        arrayOfMahasiswa[1].nim = "M2";
        arrayOfMahasiswa[1].nama = "Zilong";
        arrayOfMahasiswa[1].kelas = "TI-1B";
        arrayOfMahasiswa[1].ipk = 3.8f;

        arrayOfMahasiswa[2] = new Mahasiswa21();
        arrayOfMahasiswa[2].nim = "M3";
        arrayOfMahasiswa[2].nama = "Miya";
        arrayOfMahasiswa[2].kelas = "TI-1C";
        arrayOfMahasiswa[2].ipk = 3.9f;

        System.out.println("NIM   :  "+arrayOfMahasiswa[0].nim);
        System.out.println("Nama   :  "+arrayOfMahasiswa[0].nama);
        System.out.println("Kelas  :  "+arrayOfMahasiswa[0].kelas);
        System.out.println("IPK    :  "+arrayOfMahasiswa[0].ipk);
        System.out.println("---------------------------------------------------");

        System.out.println("NIM    :  "+arrayOfMahasiswa[1].nim);
        System.out.println("Nama   :  "+arrayOfMahasiswa[1].nama);
        System.out.println("Kelas  :  "+arrayOfMahasiswa[1].kelas);
        System.out.println("IPK    :  "+arrayOfMahasiswa[1].ipk);
        System.out.println("---------------------------------------------------");

        System.out.println("NIM    :  "+arrayOfMahasiswa[2].nim);
        System.out.println("Nama   :  "+arrayOfMahasiswa[2].nama);
        System.out.println("Kelas  :  "+arrayOfMahasiswa[2].kelas);
        System.out.println("IPK    :  "+arrayOfMahasiswa[2].ipk);
        System.out.println("---------------------------------------------------");
    }
}
