public class SLLMain00 {
    public static void main(String[] args) {

        SingleLinkedList00 sll = new SingleLinkedList00();

        // DEKLARASI OBJECT MAHASISWA
        Mahasiswa00 mhs1 =
                new Mahasiswa00(
                        "21212203",
                        "Dirga",
                        "4D",
                        3.6);

        Mahasiswa00 mhs2 =
                new Mahasiswa00(
                        "24212200",
                        "Alvaro",
                        "1A",
                        4.0);

        Mahasiswa00 mhs3 =
                new Mahasiswa00(
                        "22212202",
                        "Cintia",
                        "3C",
                        3.5);

        Mahasiswa00 mhs4 =
                new Mahasiswa00(
                        "23212201",
                        "Bimon",
                        "2B",
                        3.8);

        // KONDISI AWAL
        sll.print();

        // ADD FIRST
        sll.addFirst(mhs1);
        sll.print();

        // ADD LAST
        sll.addLast(mhs2);
        sll.print();

        // INSERT AFTER
        sll.insertAfter("21212203", mhs3);

        // INSERT AT
        sll.insertAt(2, mhs4);

        sll.print();

        // GET DATA INDEX
        System.out.println("data index 1 : ");
        sll.getData(1);

        // INDEX OF
        System.out.println(
                "data mahasiswa an Bimon berada pada index : "
                        + sll.indexOf("Bimon"));

        System.out.println();

        // REMOVE FIRST
        sll.removeFirst();

        // REMOVE LAST
        sll.removeLast();

        sll.print();

        // REMOVE AT
        sll.removeAt(0);

        sll.print();
    }
}