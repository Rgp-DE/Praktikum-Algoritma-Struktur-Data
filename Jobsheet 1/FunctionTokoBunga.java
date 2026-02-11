public class FunctionTokoBunga {

    public static void main(String[] args) {

        String[] cabang = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        // Stok bunga tiap cabang
        int[][] stok = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        tampilPendapatan(cabang, stok, harga);
    }

    // Fungsi untuk menghitung pendapatan tiap cabang
    public static double hitungPendapatanCabang(int[] stokCabang, int[] harga) {
        double total = 0;

        for (int i = 0; i < stokCabang.length; i++) {
            total += stokCabang[i] * harga[i];
        }

        return total;
    }

    // Fungsi untuk menampilkan pendapatan & status tiap cabang
    public static void tampilPendapatan(String[] cabang, int[][] stok, int[] harga) {

        System.out.println("Pendapatan Setiap Cabang");
        System.out.println("==============================================");

        for (int i = 0; i < cabang.length; i++) {

            double pendapatan = hitungPendapatanCabang(stok[i], harga);

            String status;
            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("%-15s : Rp%,.0f : %s%n",
                    cabang[i], pendapatan, status);
        }

        System.out.println("==============================================");
    }
}
