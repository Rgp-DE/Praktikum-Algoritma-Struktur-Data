import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SingleLinkedList00 sll = new SingleLinkedList00();

        System.out.print("Masukkan NIM  : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Prodi: ");
        String prodi = sc.nextLine();

        System.out.print("Masukkan IPK  : ");
        double ipk = sc.nextDouble();

        Mahasiswa00 mhs =
                new Mahasiswa00(nim, nama, prodi, ipk);

        sll.addFirst(mhs);

        sll.print();

        sc.close();
    }
}