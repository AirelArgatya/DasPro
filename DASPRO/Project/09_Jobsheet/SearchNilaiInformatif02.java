public class SearchNilaiInformatif02 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 100; // Contoh nilai yang tidak ada
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " berhasil ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mohon maaf, nilai " + key + " yang Anda cari tidak tersedia di dalam sistem array.");
        }
    }
}