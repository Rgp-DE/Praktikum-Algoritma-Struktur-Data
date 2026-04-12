import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen21[] arrayOfDosen = new Dosen21[3];
        String dummy;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen21();

            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama: ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk laki-laki, false untuk perempuan): ");
            dummy = sc.nextLine(); 
            arrayOfDosen[i].jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia: ");
            dummy = sc.nextLine(); 
            arrayOfDosen[i].usia = Integer.parseInt(dummy);
        }

        DataDosen21 dataDosen = new DataDosen21();
        
        System.out.println("\n==============================");
        dataDosen.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n==============================");
        dataDosen.jumlahDosenperJenisKelamin(arrayOfDosen);

        System.out.println("\n==============================");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n==============================");
        dataDosen.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n==============================");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }


}
