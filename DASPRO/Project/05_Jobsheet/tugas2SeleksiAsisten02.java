import java.util.Scanner;

public class tugas2SeleksiAsisten02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah anda mahasiswa aktif? (True/False) ");
        boolean keaktifan = sc.nextBoolean();

        System.out.print("Apakah anda sedang mendapat sanksi? (True/False) ");
        boolean sanksi = sc.nextBoolean();

        if (keaktifan == true && sanksi == false) {
            System.out.print("Masukkan Nilai Anda (0-100): ");
            int nilai = sc.nextInt();

            System.out.print("Apakah anda memiliki sertifikat kompetensi pemrograman? (True/False): ");
            boolean sertifikat = sc.nextBoolean();

            if (nilai >= 80 || sertifikat == true) {
                System.out.println("mahasiswa akan dipanggil untuk mengikuti wawancara");

                if (nilai >= 75 ) {
                    System.out.print("Mahasiswa diterima sebagai asisten");
                } else {
                    System.out.print("Mahasiswa tidak diterima sebagai asisten");
                }
            } else {
                System.out.println("Gagal: Nilai kurang dari 80 dan tidak memiliki sertifikat");
            }
        } else {
            System.out.println("Gagal: Mahasiswa tidak aktif atau sedang mendapat sanksi");
        }
        sc.close();
    }
}