import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {

        StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);

        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas Saat Ini"); // FITUR BARU
            System.out.print("Pilih: ");

            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();

                    System.out.print("NIM: ");
                    String nim = scan.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa21DLL mhs = new Mahasiswa21DLL(nim, nama, kelas);
                    stack.push(mhs);

                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa21DLL dinilai = stack.pop();

                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);

                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();

                        dinilai.tugasDinilai(nilai);

                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimal(nilai);
                        System.out.printf("Nilai dalam biner: %s\n", biner);
                    }
                    break;

                case 3:
                    Mahasiswa21DLL atas = stack.peek();

                    if (atas != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + atas.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa21DLL bawah = stack.peekBottom();

                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;

                case 6:
                    int jumlah = stack.getJumlah();
                    System.out.println("Jumlah tugas saat ini: " + jumlah);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih >= 1 && pilih <= 6); // UPDATE

        scan.close();
    }
}