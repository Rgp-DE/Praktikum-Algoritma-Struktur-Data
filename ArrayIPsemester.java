import java.util.Scanner;

public class ArrayIPsemester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); // buang newline

        String[] namaMK = new String[jumlahMK];
        int[] sksMK = new int[jumlahMK];
        double[] nilaiAngkaMK = new double[jumlahMK];
        String[] nilaiHurufMK = new String[jumlahMK];
        double[] bobotNilaiMK = new double[jumlahMK];

        double totalBobot = 0;
        int totalSKS = 0;

        // Input data
        for (int i = 0; i < jumlahMK; i++) {

            System.out.println("\nMata kuliah ke-" + (i + 1));

            System.out.print("Nama MK       : ");
            namaMK[i] = scanner.nextLine();

            System.out.print("Bobot SKS     : ");
            sksMK[i] = scanner.nextInt();

            System.out.print("Nilai Angka   : ");
            nilaiAngkaMK[i] = scanner.nextDouble();
            scanner.nextLine(); // buang newline

            // Validasi nilai
            if (nilaiAngkaMK[i] < 0 || nilaiAngkaMK[i] > 100) {
                System.out.println("Nilai tidak valid");
                return;
            }

            // Konversi nilai
            if (nilaiAngkaMK[i] >= 80) {
                nilaiHurufMK[i] = "A";
                bobotNilaiMK[i] = 4.0;
            } else if (nilaiAngkaMK[i] >= 73) {
                nilaiHurufMK[i] = "B+";
                bobotNilaiMK[i] = 3.5;
            } else if (nilaiAngkaMK[i] >= 65) {
                nilaiHurufMK[i] = "B";
                bobotNilaiMK[i] = 3.0;
            } else if (nilaiAngkaMK[i] >= 60) {
                nilaiHurufMK[i] = "C+";
                bobotNilaiMK[i] = 2.5;
            } else if (nilaiAngkaMK[i] >= 50) {
                nilaiHurufMK[i] = "C";
                bobotNilaiMK[i] = 2.0;
            } else if (nilaiAngkaMK[i] >= 39) {
                nilaiHurufMK[i] = "D";
                bobotNilaiMK[i] = 1.0;
            } else {
                nilaiHurufMK[i] = "E";
                bobotNilaiMK[i] = 0.0;
            }

            totalBobot += bobotNilaiMK[i] * sksMK[i];
            totalSKS += sksMK[i];
        }

        double ipSemester = totalBobot / totalSKS;

        // Output tabel
        System.out.println("\n==============================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================================");

        System.out.printf("%-25s %-15s %-15s %-15s%n",
                "Nama MK", "Nilai Angka", "Nilai Huruf", "  Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-25s %-15.2f %-15s %-15.2f%n",
                    namaMK[i],
                    nilaiAngkaMK[i],
                    nilaiHurufMK[i],
                    bobotNilaiMK[i]);
        }

        System.out.println("==============================================");
        System.out.printf("IP Semester: %.2f%n", ipSemester);
        System.out.println("==============================================");

        scanner.close();
    }
}
