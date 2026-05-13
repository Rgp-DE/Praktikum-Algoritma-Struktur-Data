package Tugas;

import java.util.Scanner;

public class MainAntrian00 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QueueLinkedList00 queue =
                new QueueLinkedList00();

        int pilih;

        do {

            System.out.println("\n=== ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM      : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama     : ");
                    String nama = sc.nextLine();

                    System.out.print("Jurusan  : ");
                    String jurusan = sc.nextLine();

                    MahasiswaLL00 mhs =
                            new MahasiswaLL00(
                                    nim,
                                    nama,
                                    jurusan);

                    queue.enqueue(mhs);

                    break;

                case 2:

                    MahasiswaLL00 keluar =
                            queue.dequeue();

                    if (keluar != null) {
                        System.out.println(
                                "Mahasiswa dipanggil:");
                        keluar.tampilData();
                    }

                    break;

                case 3:
                    queue.peekFront();
                    break;

                case 4:
                    queue.peekRear();
                    break;

                case 5:
                    queue.printQueue();
                    break;

                case 6:
                    System.out.println(
                            "Jumlah mahasiswa mengantre: "
                            + queue.getSize());
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}
