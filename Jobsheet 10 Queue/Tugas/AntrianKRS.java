public class AntrianKRS {
    Mahasiswa00[] data;
    int front, rear, size, max;

    int sudahDilayani;     // jumlah yang sudah proses KRS
    final int kapasitasDPA = 30;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa00[max];
        front = 0;
        rear = -1;
        size = 0;
        sudahDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    // ENQUEUE
    public void tambahAntrian(Mahasiswa00 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian.");
    }

    // PROSES 2 MAHASISWA
    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        int dilayaniSekarang = Math.min(2, size);

        System.out.println("Melayani:");
        for (int i = 0; i < dilayaniSekarang; i++) {
            Mahasiswa00 mhs = data[front];
            mhs.tampilkanData();

            front = (front + 1) % max;
            size--;
            sudahDilayani++;
        }
    }

    // PRINT SEMUA
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    // LIHAT 2 DEPAN
    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("2 Antrian terdepan:");
        for (int i = 0; i < Math.min(2, size); i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    // LIHAT BELAKANG
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahDilayani() {
        return sudahDilayani;
    }

    public int getBelumDilayani() {
        return kapasitasDPA - sudahDilayani;
    }
}