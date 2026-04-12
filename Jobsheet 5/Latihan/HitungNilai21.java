class HitungNilai {
 
    // Divide and Conquer MAX
    int maxUTS(Mahasiswa[] mhs, int l, int r) {

        if (l == r) {
            return mhs[l].uts;
        }

        int mid = (l + r) / 2;

        int maxKiri = maxUTS(mhs, l, mid);
        int maxKanan = maxUTS(mhs, mid + 1, r);

        return Math.max(maxKiri, maxKanan);
    }
   
    // Divide and Conquer MIN
  
    int minUTS(Mahasiswa[] mhs, int l, int r) {

        if (l == r) {
            return mhs[l].uts;
        }

        int mid = (l + r) / 2;

        int minKiri = minUTS(mhs, l, mid);
        int minKanan = minUTS(mhs, mid + 1, r);

        return Math.min(minKiri, minKanan);
    }
   
    // Brute Force rata UAS
    
    double rataUAS(Mahasiswa[] mhs) {

        int total = 0;

        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].uas;
        }

        return (double) total / mhs.length;
    }
}