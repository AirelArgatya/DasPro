import java.util.Scanner;

public class studiKasus2_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dokumen max = 4
        // juara yang masuk <= 3
        // PKM harus lolos pendanaan

        System.out.print("Masukkan Nama Anda    : ");
        String nama = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINYA): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah Dokumen Yang Di-Upload: ");
        int dokumen = sc.nextInt();

        System.out.print("Peringkat Juara       : ");
        int juara = sc.nextInt();

        System.out.print("Status Pendanaan PKM (1 = Lolos, 0 = Tidak): ");
        int status = sc.nextInt();

        System.out.println("Nama Peserta    : " + nama);
        System.out.println("Jenis Kegiatan  : " + jenisKegiatan);
        System.out.println("Jumlah Dokumen  : " + dokumen);
        System.out.println("Peringkat Juara : " + juara);

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + juara + ").");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            if (status == 1) {
                if (dokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("LAINYA")
                || jenisKegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");

        } else {
            System.out.println("Status : Jenis kegiatan tidak dikenali.");
        }
    }
}