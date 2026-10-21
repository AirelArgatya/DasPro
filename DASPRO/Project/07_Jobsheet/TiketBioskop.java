import java.util.Scanner;

public class TiketBioskop {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

int jumlahTicket;
double diskon = 0;
int tiket = 50000;

do {
    System.out.print("Masukkan jumlah tiket (ketik '0' untuk keluar): ");
    jumlahTicket = sc.nextInt();

    if (jumlahTicket <= 0 ) {
        System.out.println("Transaksi dibatalkan.");
        break;
    }
    if (jumlahTicket >= 10) {
        diskon = 0.15;
    }
    else if (jumlahTicket >= 4) {
        diskon = 0.10;
    }else{
        diskon = 0;
    }

    double total = (jumlahTicket * tiket);
    double totalAkhir = total - (total * diskon);
System.out.println("Total harga yang harus di bayar adalah: " + totalAkhir);
} while (true);

    }
}