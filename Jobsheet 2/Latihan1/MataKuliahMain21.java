public class MataKuliahMain21 {
    public static void main(String[] args) {

        // Objek 1 (konstruktor default)
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        // Objek 2 (konstruktor berparameter)
        MataKuliah21 mk2 = new MataKuliah21(
                "MK002",
                "Basis Data",
                3,
                5
        );

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(10); 
        mk2.tampilInformasi();
    }
}
