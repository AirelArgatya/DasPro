import java.util.Scanner;
public class StudiKasus1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\tProgram menghitung gaji bersih karyawan");


        System.out.print("Masukkan jumlah anak: ");
        int jAnak = sc.nextInt();

        System.out.println("Masukkan gaji pokok anda: " );
        double gPokok = sc.nextDouble();

        System.out.println("Masukkan tunjangan per-anak anda: " );
        double tAnak = sc.nextDouble();

        System.out.println("Masukkan potongan dana pensiun anda \n(jika potongan 10% maka tulis 1,00 - total potongan dalam desimal 10% = 0,10 ) " );
        double dPensiun = sc.nextDouble();

        double tGajiBersih = (gPokok * dPensiun) + (tAnak * jAnak);
        System.out.println("\n Gaji bersih anda adalah: " + tGajiBersih);
        sc.close();
    }
}
