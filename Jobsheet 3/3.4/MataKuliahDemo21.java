import java.util.Scanner;

public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah21[] arrayOfMataKuliah = new MataKuliah21[3];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            arrayOfMataKuliah[i] = new MataKuliah21(); // konstruktor default

            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
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

            System.out.println("------------------------------");

            // isi data lewat method
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Mata Kuliah:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("------------------------------");
        }

         System.out.println("\nData Mata Kuliah:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo(); // pakai method
        }
        
        sc.close();
    }
}