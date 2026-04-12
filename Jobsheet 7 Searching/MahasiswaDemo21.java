import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        // 🔥 input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21(jumMhs);


        // INPUT DATA
        for (int i = 0; i < jumMhs; i++){
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("-------------------------------");

            list.tambah(new Mahasiswa21(nim, nama, kelas, ipk));
        }

        
        System.out.println("\n===== DATA MAHASISWA =====");
        list.tampil();

        // Sequential Search
        System.out.println("\n===== PENCARIAN DATA =====");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        int posisi = list.sequentialSearching(cari);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        //Binary Search
        System.out.println("\n===== PENCARIAN DATA =====");
        System.out.print("Masukkan IPK yang dicari: ");
        System.out.print("IPK:  ");
        list.bubbleSort();

        System.out.println("Menggunakan Binary Search");
         cari = sc.nextDouble();
        int posisi2 = list.findBinarySearch(cari, 0, list.idx - 1);

     
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);

        sc.close();
    }
}