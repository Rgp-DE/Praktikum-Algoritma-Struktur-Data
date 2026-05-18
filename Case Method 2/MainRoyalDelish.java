// =======================
// Main Royal Delish
// =======================

import java.util.Scanner;

public class MainRoyalDelish {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan daftarPesanan = new DLLPesanan();

        int nomorAntrian = 1;

        int pilih;

        do {

            System.out.println("======================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Antrian Terdepan");
            System.out.println("6. Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    Pembeli p =
                            new Pembeli(nomorAntrian, nama, hp);

                    antrian.addLast(p);

                    System.out.println("Antrian berhasil ditambahkan dengan nomor : " + nomorAntrian);

                    nomorAntrian++;

                    break;

                case 2:

                    antrian.print();

                    break;

                case 3:

                    Pembeli dipanggil = antrian.removeFirst();

                    if (dipanggil != null) {

                        System.out.println("Masukkan Pesanan");
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        sc.nextLine();

                        Pesanan psn =
                                new Pesanan(kode, namaPesanan, harga);

                        daftarPesanan.addLast(psn);

                        System.out.println(dipanggil.namaPembeli +
                                " telah memesan " +
                                namaPesanan);
                    }

                    break;

                case 4:

                    daftarPesanan.print();

                    break;

                case 5:

                    antrian.peekFront();

                    break;

                case 6:

                    antrian.peekRear();

                    break;

                case 0:

                    System.out.println("Program selesai");

                    break;

                default:

                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);

        sc.close();
    }
}