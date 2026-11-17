import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
    double X;
    double Y;
    double Z; // berapa bulan mau dicicil




    System.out.print("Masukkan Harga Laptop: ");
    X = sc.nextDouble();

    System.out.print("Masukkan Uang Muka: ");
    Y = sc.nextDouble();

    System.out.print("Masukkan Mau Cicil Berapa Bulan: ");
    Z = sc.nextDouble();

   double totalCicilan = (X - Y) / Z;
   double totalAkhir = totalCicilan + ((X - Y)* 0.02);

    System.out.println("Total Cicilan Perbulan Anda: " + (int)totalAkhir);

    sc.close();

    }
}
