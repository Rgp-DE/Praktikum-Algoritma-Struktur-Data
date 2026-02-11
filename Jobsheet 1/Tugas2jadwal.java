import java.util.Scanner;

public class Tugas2jadwal {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[][] jadwal = new String[n][4];

        // Input jadwal
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = input.nextLine();
        }

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cari Jadwal Berdasarkan Hari");
            System.out.println("2. Cari Jadwal Berdasarkan Nama MK");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Hari: ");
                    String hari = input.nextLine();
                    cariBerdasarkanHari(jadwal, hari);
                    break;

                case 2:
                    System.out.print("\nMasukkan Nama MK: ");
                    String mk = input.nextLine();
                    cariBerdasarkanMK(jadwal, mk);
                    break;

                case 3:
                    System.out.println("\nProgram selesai ");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid ");
            }

        } while (pilihan != 3);

        input.close();
    }

    // Cari berdasarkan Hari
    static void cariBerdasarkanHari(String[][] jadwal, String hari) {
        boolean ada = false;

        System.out.println("\nJadwal Hari " + hari + ":");
        System.out.println("-----------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("Nama MK : " + jadwal[i][0]);
                System.out.println("Ruang   : " + jadwal[i][1]);
                System.out.println("Jam     : " + jadwal[i][3]);
                System.out.println("-----------------------------------");
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal di hari tersebut bro ");
        }
    }

    // Cari berdasarkan Nama Matkul
    static void cariBerdasarkanMK(String[][] jadwal, String mk) {
        boolean ada = false;

        System.out.println("\nJadwal Mata Kuliah " + mk + ":");
        System.out.println("-----------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Nama MK : " + jadwal[i][0]);
                System.out.println("Ruang   : " + jadwal[i][1]);
                System.out.println("Hari    : " + jadwal[i][2]);
                System.out.println("Jam     : " + jadwal[i][3]);
                System.out.println("-----------------------------------");
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Mata kuliah tidak ditemukan bro ");
        }
    }
}
