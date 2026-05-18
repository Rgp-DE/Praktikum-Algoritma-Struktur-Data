public class DLLPembeli {

    NodePembeli head;
    NodePembeli tail;

    boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli data) {

        NodePembeli newNode =
                new NodePembeli(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Pembeli removeFirst() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        Pembeli dataHapus = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return dataHapus;
    }

    public void print() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli temp = head;

        System.out.println("======================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================================");
        System.out.println("No Antrian\tNama\t\tNo HP");

        while (temp != null) {
            temp.data.tampilPembeli();
            temp = temp.next;
        }

        System.out.println("======================================");
    }

    public void peekFront() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            head.data.tampilPembeli();
        }
    }

    public void peekRear() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling belakang:");
            tail.data.tampilPembeli();
        }
    }

    public int size() {

        int jumlah = 0;
        NodePembeli temp = head;

        while (temp != null) {
            jumlah++;
            temp = temp.next;
        }

        return jumlah;
    }
}