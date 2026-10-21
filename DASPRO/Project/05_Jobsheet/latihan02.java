import java.util.Scanner;

public class latihan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lain): ");
        String jenis = scanner.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku: ");
        int jumlah = scanner.nextInt();

        double diskon = 0;

        if (jenis.equals("kamus")) {
            diskon = 10;

            if (jumlah > 2) {
                diskon = diskon + 2;
            }

        } else {
            if (jenis.equals("novel")) {
                diskon = 7;

                if (jumlah > 3) {
                    diskon = diskon + 2;
                } else {
                    if (jumlah <= 3) {
                        diskon = diskon + 1;
                    }
                }

            } else {
                if (jumlah > 3) {
                    diskon = 5;
                }
            }
        }

        System.out.println("Jumlah diskon: " + diskon + "%");

        scanner.close();
    }
}