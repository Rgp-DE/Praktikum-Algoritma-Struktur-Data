import java.util.Scanner;

public class PeminjamanMain21 {

    // INSERTION SORT
    static void insertionSort(Peminjaman21[] data) {
        for (int i = 1; i <= data.length - 1; i++) {

            Peminjaman21 temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].denda < temp.denda) { // DESC
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = temp;
        }
    }

    // SEQUENTIAL SEARCH
    static void sequentialSearch(Peminjaman21[] data, String cari) {
    boolean ditemukan = false;

    for (int j = 0; j < data.length; j++) {
        if (data[j].mhs.nim.equals(cari)) {
            data[j].tampilPeminjaman();
            ditemukan = true;
        }
    }

    if (!ditemukan) {
        System.out.println("Data tidak ditemukan!");
    }
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa21CM[] mhs = new Mahasiswa21CM[3];
        mhs[0] = new Mahasiswa21CM("22001", "Andi", "Teknik Informatika");
        mhs[1] = new Mahasiswa21CM("22002", "Budi", "Teknik Informatika");
        mhs[2] = new Mahasiswa21CM("22003", "Citra", "Sistem Informasi Bisnis");

        Buku21[] buku = new Buku21[4];
        buku[0] = new Buku21("B001", "Algoritma", 2020);
        buku[1] = new Buku21("B002", "Basis Data", 2019);
        buku[2] = new Buku21("B003", "Pemrograman", 2021);
        buku[3] = new Buku21("B004", "Fisika", 2024);

        Peminjaman21[] pinjam = new Peminjaman21[5];
        pinjam[0] = new Peminjaman21(mhs[0], buku[0], 7);
        pinjam[1] = new Peminjaman21(mhs[1], buku[1], 3);
        pinjam[2] = new Peminjaman21(mhs[2], buku[2], 10);
        pinjam[3] = new Peminjaman21(mhs[2], buku[3], 6);
        pinjam[4] = new Peminjaman21(mhs[0], buku[1], 4);

        // hitung denda
        for (int i = 0; i < pinjam.length; i++) {
            pinjam[i].hitungDenda();
        }

        int pilihan;

        do {
            System.out.println("\n===== SISTEM MANAJEMEN RAUNG BACA JTI =====");
            System.out.println("1. Tampil Mahasiswa");
            System.out.println("2. Tampil Buku");
            System.out.println("3. Tampil Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

               case 1:
                    System.out.println("=== DATA MAHASISWA ===");
                    for (int i = 0; i < mhs.length; i++) {
                        mhs[i].tampilMhs();
                    }
                    break;

                case 2:
                    System.out.println("=== DATA BUKU ===");
                    for (int i = 0; i < buku.length; i++) {
                        buku[i].tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("=== DATA PEMINJAMAN ===");
                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampilPeminjaman();
                    }
                    break;

                case 4:
                    insertionSort(pinjam);
                    System.out.println("=== DATA SETELAH SORTING (DENDA TERBESAR) ===");
                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    System.out.println("=== HASIL PENCARIAN ===");
                    sequentialSearch(pinjam, cari);

                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}