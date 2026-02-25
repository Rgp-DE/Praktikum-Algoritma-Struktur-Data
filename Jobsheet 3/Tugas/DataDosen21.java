public class DataDosen21 {
    
    public void dataSemuaDosen(Dosen21[] arrayOfDosen) {
        int no = 1;
        for (Dosen21 dosen : arrayOfDosen) {
            System.out.println("\nData dosen ke-" + no++);
            System.out.println("Kode: " + dosen.kode);
            System.out.println("Nama: " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + dosen.usia);
        }
    }

    public void jumlahDosenperJenisKelamin(Dosen21[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }

        System.out.println("\nJumlah Dosen Laki-laki: " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan: " + jumlahPerempuan);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaLakiLaki += dosen.usia;
                jumlahLakiLaki++;
            } else {
                totalUsiaPerempuan += dosen.usia;
                jumlahPerempuan++;
            }
        }

        double rerataUsiaLakiLaki = jumlahLakiLaki > 0 ? (double) totalUsiaLakiLaki / jumlahLakiLaki : 0;
        double rerataUsiaPerempuan = jumlahPerempuan > 0 ? (double) totalUsiaPerempuan / jumlahPerempuan : 0;

        System.out.println("\nRerata Usia Dosen Laki-laki: " + rerataUsiaLakiLaki);
        System.out.println("Rerata Usia Dosen Perempuan: " + rerataUsiaPerempuan);
    }   

    public void infoDosenPalingTua(Dosen21[] arrayOfDosen) {
        Dosen21 dosenTua = arrayOfDosen[0];

        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        System.out.println("Kode: " + dosenTua.kode);
        System.out.println("Nama: " + dosenTua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + dosenTua.usia);
    }

    public void infoDosenPalingMuda(Dosen21[] arrayOfDosen) {
        Dosen21 dosenMuda = arrayOfDosen[0];

        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        System.out.println("Kode: " + dosenMuda.kode);
        System.out.println("Nama: " + dosenMuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenMuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + dosenMuda.usia);
    }
}
