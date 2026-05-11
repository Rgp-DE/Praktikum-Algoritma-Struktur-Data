import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SingleLinkedList00 sll = new SingleLinkedList00();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Prodi : ");
            String prodi = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa00 mhs =
                    new Mahasiswa00(nim, nama, prodi, ipk);

            sll.addLast(mhs);
        }

        System.out.println("\nIsi Linked List:");
        sll.print();

        sc.close();
    }
}