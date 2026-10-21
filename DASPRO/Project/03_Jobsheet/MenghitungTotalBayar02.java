import java.util.Scanner;
public class MenghitungTotalBayar02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Harga Baju: ");
        double hargaBaju = sc.nextDouble();
        
        double discount = 0.15;
        double totalBayar = hargaBaju - (hargaBaju * discount);
        System.out.print("Total Bayar: " + totalBayar);
        sc.close();
    }
}