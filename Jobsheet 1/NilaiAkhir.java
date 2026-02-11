import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        System.out.println("================================");

        // Validasi input
        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("================================");

        } else {

            // Perhitungan sesuai soal
            double nilaiAkhir = (0.20 * nilaiTugas) +
                                (0.20 * nilaiKuis) +
                                (0.30 * nilaiUTS) +
                                (0.40 * nilaiUAS);

            String grade;
            String keterangan;

            if (nilaiAkhir >= 80) {
                grade = "A";
            } else if (nilaiAkhir >= 73) {
                grade = "B+";
            } else if (nilaiAkhir >= 65) {
                grade = "B";
            } else if (nilaiAkhir >= 60) {
                grade = "C+";
            } else if (nilaiAkhir >= 50) {
                grade = "C";
            } else if (nilaiAkhir >= 39) {
                grade = "D";
            } else {
                grade = "E";
            }

            if (grade.equals("A") || grade.equals("B+") ||
                grade.equals("B") || grade.equals("C+") ||
                grade.equals("C")) {

                keterangan = "SELAMAT ANDA LULUS";
            } else {
                keterangan = "ANDA TIDAK LULUS";
            }

            System.out.printf("nilai akhir : %.1f%n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + grade);
            System.out.println("================================");
            System.out.println(keterangan);
            System.out.println("================================");
        }

        scanner.close();
    }
}

    

