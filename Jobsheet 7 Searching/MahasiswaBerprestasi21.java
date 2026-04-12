public class MahasiswaBerprestasi21 {
    
    Mahasiswa21[] listMhs;;
    int idx;

    MahasiswaBerprestasi21(int kapasitas){
        listMhs = new Mahasiswa21[kapasitas];
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left ){
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk){
                return (mid);
            }
            else if (listMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid+1, right);
            } 
        }
        return -1;
    }

    void bubbleSort(){
    for (int i = 0; i < idx - 1; i++){
        for (int j = 1; j < idx - i; j++){
            if (listMhs[j-1].ipk > listMhs[j].ipk){
                Mahasiswa21 tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
            }
        }
    }
}

    void tambah(Mahasiswa21 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
        
    }

     void tampil(){
        if (idx == 0){
            System.out.println("Data masih kosong!");
            return;
        }

        for (int i = 0; i < idx; i++){
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK: " + x + "ditemukan pada indeks "+ pos );

        }
        else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1){
            System.out.println("nim\t   : " + listMhs[pos].nim);
            System.out.println("nama\t  : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t   : " + x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK" + x + "tidak ditemukan");
        }
    }
}


