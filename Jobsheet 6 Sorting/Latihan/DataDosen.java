public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx;

    // tambah data
    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // tampil data
    void tampil() {
        if (idx == 0) {
            System.out.println("Data kosong!");
            return;
        }

        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("-----------------------");
        }
    }

    //Sorting ASC (Bubble Sort - termuda ke tertua)
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    // Sorting DSC (Selection Sort - tertua ke termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;

            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }

            Dosen temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}