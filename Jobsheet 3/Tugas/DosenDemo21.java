import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen21[] arrayOfDosen = new Dosen21[3];
        String dummy;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen21();

            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama: ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk laki-laki, false untuk perempuan): ");
            dummy = sc.nextLine(); 
            arrayOfDosen[i].jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia: ");
            dummy = sc.nextLine(); 
            arrayOfDosen[i].usia = Integer.parseInt(dummy);
        }

        int no = 1;
        for (Dosen21 dosen : arrayOfDosen) {
            System.out.println("\nData dosen ke-" + no++);
            System.out.println("Kode: " + dosen.kode);
            System.out.println("Nama: " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + dosen.usia);

        }
        sc.close();
    }


}
