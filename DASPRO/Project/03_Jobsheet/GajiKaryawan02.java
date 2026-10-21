import java.util.Scanner;
public class GajiKaryawan02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMakan = 400000;
         
        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = sc.nextInt();

        bonus = gajiPokok * 0.05;
        totGaji = gajiPokok+bonus+tunjTransp+tunjMakan-gajiPokok*0.1;

        System.out.println("Total Gaji: " + (int)totGaji);
        sc.close();
    }
}
