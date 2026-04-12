public class Mahasiswa21 {
    
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa21(String string, String string2, String string3){
    }

    Mahasiswa21(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("NIM:    " + nim);
        System.out.println("Nama:   " + nama);
        System.out.println("Kelas:  " + kelas);
        System.out.println("IPK:    " + ipk);
    }

  

}
