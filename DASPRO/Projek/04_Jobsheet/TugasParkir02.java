import java.util.Scanner;

public class TugasParkir02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\n\nMesin Penghitung Parkir\n");

    int tarif0 = 2000;
    int tarif = 1000;
    int lamaParkir;
    int totalParkir = 0;

    System.out.print("Masukkan lama parkir anda... ");
    lamaParkir = sc.nextInt();

    if (lamaParkir > 2) {
       totalParkir = ((lamaParkir - 2) * 1000) + 2000;
       System.out.println("Total Bayar Parkir Anda Adalah.. " + totalParkir);
    }
    else {
      System.out.println("Biaya Parkir Anda 2000");
    } 

    sc.close();

  }
}