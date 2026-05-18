public class DLLPesanan {

    NodePesanan head;
    NodePesanan tail;

    boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan data) {

        NodePesanan newNode =
                new NodePesanan(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortPesanan() {

        if (isEmpty()) {
            return;
        }

        NodePesanan current;
        NodePesanan index;

        for (current = head; current.next != null; current = current.next) {

            for (index = current.next; index != null; index = index.next) {

                if (current.data.namaPesanan.compareToIgnoreCase(index.data.namaPesanan) > 0) {

                    Pesanan temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    public void print() {

        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sortPesanan();

        NodePesanan temp = head;

        System.out.println("==============================================");
        System.out.println("LAPORAN PESANAN");
        System.out.println("==============================================");
        System.out.println("Kode\t\tNama Pesanan\t\tHarga");

        while (temp != null) {
            temp.data.tampilPesanan();
            temp = temp.next;
        }

        System.out.println("==============================================");
        System.out.println("Total Pendapatan : " + hitungTotal());
    }

    public int hitungTotal() {

        int total = 0;

        NodePesanan temp = head;

        while (temp != null) {
            total += temp.data.harga;
            temp = temp.next;
        }

        return total;
    }
}
