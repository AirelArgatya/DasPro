import java.util.Scanner;
public class studiKasus1_02 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("===  Kedai Kopi Gula Aren  ===");

        int kopiSusu = 18000;
        double totalAkhir;
        
        System.out.print("Msukkan Cup : ");
        int totalCup = sc.nextInt();
        int bayar = kopiSusu * totalCup;
        

        System.out.print("Uang Bayar  : " );
        int uangMuka = sc.nextInt();

        System.out.println("Total Harga: " + bayar);

        if (bayar >= 100000) {
            System.out.println("diskon      : 10% ");
        }
        else {
            System.out.println("diskon      : 0%");
        }

        if (bayar >= 100000) {
            totalAkhir = bayar - (bayar * 0.10);
            System.out.println("Total Harga : " + totalAkhir);
        }
        else if (bayar < 100000) {
            System.out.println("Total Harga : " + bayar);
        }

        

        if (uangMuka >= bayar) {
            System.out.println("Pembayaran Valid");
        }
        else {
            System.out.println("pembayaran tidak valid");
        }

        sc.close();


    }
}