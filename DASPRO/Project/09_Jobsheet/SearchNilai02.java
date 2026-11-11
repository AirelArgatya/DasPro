import java.util.Arrays;

public class SearchNilai02 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};

        // Proses Bubble Sort secara Descending (besar ke kecil)
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                // Ubah tanda '>' menjadi '<' untuk mengurutkan secara descending
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Hasil setelah diurutkan (Descending):");
        System.out.println(Arrays.toString(nilai));
    }
}