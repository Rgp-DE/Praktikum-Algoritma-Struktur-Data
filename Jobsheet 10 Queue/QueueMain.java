import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
    System.out.println("3. Print");
    System.out.println("4. Peek");
    System.out.println("5. Clear");
    System.out.println("---------------------------------");
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan kapasitas queue: ");
    int n = scanner.nextInt();
    Queue queue = new Queue(n);

    int choice;
    do {
        menu();
        System.out.print("Masukkan pilihan: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Masukkan data baru: ");
                int dataMasuk = scanner.nextInt();
                queue.enqueue(dataMasuk);
                break;
            case 2:
                int dataKeluar = queue.dequeue();
                if (dataKeluar != 0) {
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                }
                break;
            case 3:
                queue.print();
                break;
            case 4:
                queue.peek();
                break;
            case 5:
                queue.clear();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }    
    } while (choice != 0);


    
    scanner.close();
    }
}

    



