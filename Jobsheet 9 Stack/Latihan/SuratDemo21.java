import java.util.Scanner;

public class SuratDemo21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackSurat21 stack = new StackSurat21(10);

        int pilih;

        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);

                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat21 srt = new Surat21(id, nama, kelas, jenis, durasi);
                    stack.push(srt);

                    System.out.println("Surat berhasil diterima!");
                    break;

                case 2:
                    Surat21 proses = stack.pop();

                    if (proses != null) {
                        System.out.println("Memproses surat:");
                        proses.tampil();
                    }
                    break;

                case 3:
                    Surat21 lihat = stack.peek();

                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();

                    int posisi = stack.cari(cari);

                    if (posisi != -1) {
                        int urutan = stack.top - posisi + 1;
                        System.out.println("Surat ditemukan di tumpukan ke-" + urutan);
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}