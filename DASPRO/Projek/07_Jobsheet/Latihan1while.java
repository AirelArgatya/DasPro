import java.util.Scanner;

public class Latihan1while {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        double total = 0;

        while (i < 8) {
            System.out.print("Masukkan Durasi Belajar Hari ke - " + i + ":");
            double durasi = sc.nextDouble();

            while (durasi > 10 || durasi < 0) {
                System.out.print("Jam belajar tidak masuk akal");
                System.out.print("Masukkan jam belajar < 10: ");
                durasi = sc.nextDouble();
            }

            total = total + durasi;
            i++;
        }

        System.out.print("Total jam belajar anda dalam 1 minggu: " + total);
        sc.close();
    }
}