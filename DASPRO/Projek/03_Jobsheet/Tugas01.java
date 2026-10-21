import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
    double X;
    double Y;
    double Z; // berapa bulan mau dicicil




    System.out.print("Masukkan Harga Laptop: ");
    X = scanner.nextDouble();

    System.out.print("Masukkan Uang Muka: ");
    Y = scanner.nextDouble();

    System.out.print("Masukkan Mau Cicil Berapa Bulan: ");
    Z = scanner.nextDouble();

   double totalCicilan = (X - Y) / Z;
   double totalAkhir = totalCicilan + ((X - Y)* 0.02);

    System.out.println("Total Cicilan Perbulan Anda: " + (int)totalAkhir);

    sc.close();

    }
}
