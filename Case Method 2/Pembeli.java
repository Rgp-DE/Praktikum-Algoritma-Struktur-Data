public class Pembeli {
    int noAntrian;
    String namaPembeli;
    String noHp;

    public Pembeli(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampilPembeli() {
        System.out.println(noAntrian + "\t\t" + namaPembeli + "\t\t" + noHp);
    }
}