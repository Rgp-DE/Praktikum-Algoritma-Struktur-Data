public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampilPesanan() {
        System.out.println(kodePesanan + "\t\t" + namaPesanan + "\t\t" + harga);
    }
}
