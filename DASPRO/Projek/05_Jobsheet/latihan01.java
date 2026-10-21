
import java.util.Scanner;

public class latihan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1;
        int bil2;
		int bil3;

        int max;

        System.out.print("Masukkan bilangan 1... ");
         bil1 = sc.nextInt();
         System.out.print("Masukkan bilangan 2... ");
         bil2 = sc.nextInt();
         System.out.print("Masukkan bilangan 3... ");
         bil3 = sc.nextInt();

        max = bil1;

        if (bil2 > bil1) {
            if (bil2 > bil3) {
                max = bil2;
            }
        }

        if (bil3 > bil1) {
            if (bil3 > bil2) {
                max = bil3;
            }
        }

        System.out.println("bilangan terbesar = " + max);
        sc.close();
        }
    }

