import java.util.Scanner;

public class menghitungBonus {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = 1;

        System.out.print("Masukkan Total Kariawan Anda: ");
        int i = sc.nextInt();

        System.out.print("Masukkan gaji harian karyawan: ");
        int gaji = sc.nextInt();

        

        while (q <= i) {
            System.out.print("Masukkan Lama kerja karyawan ke " + q + ": ");
            int lama = sc.nextInt();

            while (lama > 24 || lama < 0) {
                System.out.print("Jam Kerja Tidak Valid Input Ulang: ");
                lama = sc.nextInt();
            }
            if (lama > 8) {
                double bonus = ((lama - 8) * 0.20) * gaji;
                System.out.println("Total bonus karyawan ke " + q + "adalah: " + bonus);
            }else{
                double bonus = 0;
                System.out.println("Total bonus karyawan ke " + q + "adalah: " + bonus);
            }
            q++;
        }

    }
}
