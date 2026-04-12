public class Peminjaman21 {
    Mahasiswa21CM mhs;
    Buku21 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman21(Mahasiswa21CM mhs, Buku21 buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda (){
        if (lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        }
        else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(
            "Nama: " + mhs.nama + "|  Judul Buku: " + buku.judul + "|  Lama Pinjam: " + lamaPinjam + "|  Terlambat: " + terlambat + "|  Denda:" + denda
        );
    }




}
