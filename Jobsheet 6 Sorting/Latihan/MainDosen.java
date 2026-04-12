import java.util.Scanner;

public class MainDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();

        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n-- Input Data Dosen --");

                    System.out.print("Kode  : ");
                    String kode = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (true=Laki, false=Perempuan): ");
                    boolean jk = sc.nextBoolean();

                    System.out.print("Usia  : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen d = new Dosen(kode, nama, jk, usia);
                    data.tambah(d);
                    break;

                case 2:
                    System.out.println("\n-- Data Dosen --");
                    data.tampil();
                    break;

                case 3:
                    System.out.println("\n-- Sorting ASC (Bubble Sort) --");
                    data.SortingASC();
                    data.tampil();
                    break;

                case 4:
                    System.out.println("\n-- Sorting DSC (Selection Sort) --");
                    data.sortingDSC();
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);

        sc.close();
    }
}