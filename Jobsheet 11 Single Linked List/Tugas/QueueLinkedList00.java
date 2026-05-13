package Tugas;

public class QueueLinkedList00 {

    Node00 front;
    Node00 rear;
    int size;
    int max = 10;

    // CEK KOSONG
    public boolean isEmpty() {
        return front == null;
    }

    // CEK PENUH
    public boolean isFull() {
        return size == max;
    }

    // CLEAR
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    // ENQUEUE
    public void enqueue(MahasiswaLL00 mhs) {

        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node00 newNode = new Node00(mhs);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;

        System.out.println(
                mhs.nama +
                " berhasil masuk antrian");
    }

    // DEQUEUE
    public MahasiswaLL00 dequeue() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }

        MahasiswaLL00 data = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;

        return data;
    }

    // LIHAT DEPAN
    public void peekFront() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        }
    }

    // LIHAT BELAKANG
    public void peekRear() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilData();
        }
    }

    // PRINT SEMUA
    public void printQueue() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {

            Node00 temp = front;

            System.out.println("Daftar Antrian:");

            while (temp != null) {
                temp.data.tampilData();
                temp = temp.next;
            }
        }
    }

    // JUMLAH ANTRIAN
    public int getSize() {
        return size;
    }
}
