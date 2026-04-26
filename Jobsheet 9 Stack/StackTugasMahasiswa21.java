public class StackTugasMahasiswa21 {
    Mahasiswa21[] stack;
    int top;
    int size;

    public StackTugasMahasiswa21(int size) {
        this.size = size;
        stack = new Mahasiswa21[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (!isFull()){
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa21 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack sudah penuh! Tidak bisa menambahkan tugas.");
        }
    }

    public Mahasiswa21 pop() {
        if (!isEmpty()) {
            Mahasiswa21 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa21 peek() {
        if (!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println("NIM: " + stack[i].nim + ", Nama: " + stack[i].nama + ", Kelas: " + stack[i].kelas);
        }
        System.out.println("");
        }
            
}

