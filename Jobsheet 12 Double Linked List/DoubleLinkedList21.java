public class DoubleLinkedList21 {
        Node21 head;
        Node21 tail;    

        public DoubleLinkedList21() {
            this.head = null;
            this.tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void addFirst(Mahasiswa21DLL data) {
            Node21 newNode = new Node21(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public void addLast(Mahasiswa21DLL data) {
            Node21 newNode = new Node21(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void insertAfter(String keyNim, Mahasiswa21DLL data) {
            Node21 current = head;
            while (current != null && !current.data.nim.equals(keyNim)) {
                current = current.next;
            }
            if (current == null){
                System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
                return;
            }
                Node21 newNode = new Node21(data);
            
            if(current == tail){
                newNode.prev = current;
                current.next = newNode;
                tail = newNode;
            } else {
                newNode.prev = current;
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;

            }
            System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
        }

        public void print(){
            if (isEmpty()) {
                System.out.println("Linked List kosong.");
                return;
            }
            Node21 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }

        public void printReverse() {
            if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
            }

            System.out.println("Isi Double Linked List (Reverse):");

            Node21 current = tail;

            while (current != null) {
                current.data.tampil();
                current = current.prev;
            }
        }

        public void removeFirst() {

            if (isEmpty()) {
                System.out.println("Linked List kosong. Tidak ada yang dihapus.");
                return;
            }

            Mahasiswa21DLL dataHapus = head.data;

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

            System.out.println("Data berhasil dihapus:");
            dataHapus.tampil();
        }

        public void removeLast() {

            if (isEmpty()) {
                System.out.println("Linked List kosong. Tidak ada yang dihapus.");
                return;
            }

            Mahasiswa21DLL dataHapus = tail.data;

            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }

            System.out.println("Data berhasil dihapus:");
            dataHapus.tampil();
        }
}

