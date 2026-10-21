import java.util.Scanner;

public class Studi_Kasus2_02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

/*  Bu Dina adalah salah satu nasabah bank ABC
 yang menabung sebesar Rp. 5 juta rupiah. 
 Bank tersebut memberikan bunga sebesar 2% setiap tahun.  
 Bu Dina menabung selama 5 tahun. Berapakah bunga dan jumlah 
 tabungan yang dapat diambil sekarang! */

int TabunganDasar = 5000000;
int LamaMenabung = 5; //Tahun
double Bg = 1.02;  //Tahun

System.out.println("\nTabungan dasar Bu Dina adalah: Rp. " + TabunganDasar);
System.out.println("Lama menabung Bu Dina adalah: " + LamaMenabung + " Tahun");
System.out.println("Bunga yang diberikan bank adalah: " + (Bg * 100) + "%");

System.out.println("\nSetelah menabung selama 1 Tahun:");
System.out.println(TabunganDasar * Bg);

System.out.println("\nSetelah menabung selama 2 Tahun:");
System.out.println(TabunganDasar * Bg * Bg);

System.out.println("\nSetelah menabung selama 3 Tahun:");
System.out.println(TabunganDasar * Bg * Bg * Bg);

System.out.println("\nSetelah menabung selama 4 Tahun:");
System.out.println(TabunganDasar * Bg * Bg * Bg * Bg);

System.out.println("\nSetelah menabung selama 5 Tahun:");
System.out.println(TabunganDasar * Bg * Bg * Bg * Bg * Bg);

System.out.println("\nJadi setelah menabung selama 5 tahun, Total uang Bu Dina adalah: 5520404.016");
    }
}