import java.util.Scanner;

public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine(); 

        MataKuliah21[] arrayOfMataKuliah = new MataKuliah21[jumlahMK];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));

            System.out.print("Kode: ");
            kode = sc.nextLine();

            System.out.print("Nama: ");
            nama = sc.nextLine();

            System.out.print("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMataKuliah[i] = new MataKuliah21(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }

        sc.close();
    }
}