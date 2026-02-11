import java.util.Scanner;

public class LoopingNIM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input NIM: ");
        long nim = scanner.nextLong();

        // 2 digit terakhir menggunakan modulus
        int n = (int) (nim % 100);

        // Jika n < 10 tambahkan 10
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {

            // Lewati angka 10 dan 15
            if (i == 10 || i == 15) {
                continue;
            }

            // Kelipatan 3
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            // Genap selain kelipatan 3
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            // Ganjil
            else {
                System.out.print("* ");
            }
        }

        scanner.close();
    }
}
