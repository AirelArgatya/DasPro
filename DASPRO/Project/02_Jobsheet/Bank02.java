import java.util.Scanner;
public class Bank02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTabunganAwal, LamaMenabung;
        double PersentaseBunga = 0.02, bunga, totalTabunganAkhir;

        System.out.print("Masukkan total tabungan awal anda: ");
        totalTabunganAwal = sc.nextInt();
        System.out.print("Masukkan lama menabung anda (dalam tahun): ");
        LamaMenabung = sc.nextInt();

        bunga = totalTabunganAwal * (PersentaseBunga * LamaMenabung);
        totalTabunganAkhir = totalTabunganAwal + bunga;

        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Total tabungan akhir adalah: " + totalTabunganAkhir);
        sc.close();
    }
}
