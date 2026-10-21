import java.util.Scanner;
public class ParkirDoWhile {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

do {
    System.out.println("List Input: 0 = Keluar 1 = Motor 2 = Mobil  ");
    System.out.print("Masukkan pilihan anda: ");
    int tipe = sc.nextInt();

    if (tipe <= 0) {
        break;
    }

    System.out.print("Masukkan lama parkir anda: ");
    double lama = sc.nextDouble();

    switch (tipe) {
        case 1: total = lama * 2000;
        break;
        case 2: total = lama * 3000;
        break;
    }
System.out.println("Total biaya anda adalah: " + total);
} while (true);

    }
}
