import java.util.Scanner;

public class TugasAntrean02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" === PILIH SITUS WEB === ");
        System.out.println("Legalisir Ijazah                 = A");
        System.out.println("Surat Keterangan Aktif Kuliah    = B");
        System.out.println("Pembayaran UKT                   = C");
        System.out.println("pengajuan Cuti Akademik          = D\n");

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.print("Masukkan Pilihan Web Anda (a-d): ");
        String pilihan = sc.next();

        switch (pilihan) {
            case "a":
                System.out.println("Selamat Datang di Menu Legalisir Ijazah");
                break;
            case "b":
                System.out.println("Selamat Datang di Menu Surat Keterangan Aktif Kuliah");
                break;
            case "c":
                System.out.println("Selamat Datang di Menu Pembayaran UKT");
                break;
            case "d":
                System.out.println("Selamat Datang di Menu pengajuan Cuti Akademik");
                break;
            default:
                System.out.println("Web anda tidak valid!");
        }
        sc.close();
    }
}
