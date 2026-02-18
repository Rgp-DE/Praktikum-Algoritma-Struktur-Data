public class DosenMain21 {
    public static void main(String[] args) {

        // Objek 1 (Konstruktor default)
        Dosen21 dosen1 = new Dosen21();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Alan Walker B.Tech";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2018;
        dosen1.bidangKeahlian = "Pemrograman";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Kecerdasan Buatan");

        int masaKerja1 = dosen1.hitungMasaKerja(2026);
        System.out.println("Masa kerja dosen: " + masaKerja1 + " tahun");
        dosen1.tampilInformasi();

        // Objek 2 (Konstruktor berparameter)
        Dosen21 dosen2 = new Dosen21(
                "D002",
                "Prof. Martin Garrix M.Tech",
                true,
                2015,
                "Machine Learning"
        );

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);

        int masaKerja2 = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa kerja dosen: " + masaKerja2 + " tahun");
        dosen2.ubahKeahlian("Data Science");
        dosen2.tampilInformasi();
    }
}
