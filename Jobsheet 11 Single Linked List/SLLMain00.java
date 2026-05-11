public class SLLMain00 {
    public static void main(String[] args) {
        SingleLinkedList00 sll = new SingleLinkedList00();
        
        Mahasiswa00 mhs1 =
                new Mahasiswa00("Dirga",
                        "21212203",
                        "4D",
                        3.6);

        Mahasiswa00 mhs2 =
                new Mahasiswa00("Alvaro",
                        "24212200",
                        "1A",
                        4.0);

        Mahasiswa00 mhs3 =
                new Mahasiswa00("Cintia",
                        "22212202",
                        "3C",
                        3.5);

        Mahasiswa00 mhs4 =
                new Mahasiswa00("Bimon",
                        "23212201",
                        "2B",
                        3.8);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
    }
}
