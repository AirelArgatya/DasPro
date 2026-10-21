import java.util.Scanner;
public class StudiKasus2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t\t\t\tProgram menghitung Luas Tanah\n");
        System.out.println("\n\t\t\tProgram ini bertujuan untuk menghitung luas tanah sisa dari 3 input\n\n\n");
        
        System.out.print("Masukkan panjang tanah: ");
        double pTanah = sc.nextDouble();

        System.out.print("Masukkan lebar tanah: ");
        double lTanah = sc.nextDouble();

        System.out.print("Masukkan diameter lingkaran: ");
        double dLingkaran = sc.nextDouble();

        System.out.println("Masukkan Panjang sisi persegi untuk taman: ");
        double sTaman = sc.nextDouble();

        double luasTanah = pTanah * lTanah;
        double luasLingkaran = Math.PI * (dLingkaran / 2) * (dLingkaran / 2);
        double lPersegi = sTaman * sTaman;

        double luasTanahBersih = luasTanah - (luasLingkaran + lPersegi);
        System.out.println("\nLuas tanah bersih adalah: " + luasTanahBersih);
        System.out.println("Jika hasil penghitungan  minus maka luas tanah tidak cukup untuk taman dan kolam ikan");

        sc.close();

        
    }
}
