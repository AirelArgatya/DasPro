import java.util.Scanner;

public class tugas202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n;
        int total = 0;
        int totalF = 0;

        do {System.out.print("Masukkan nilai n: ");
        n = sc.nextInt(); 
        if (n < 3) {
            System.out.println("Input harus lebih besar dari 3");
            }
        } while (n < 3);

        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= n; j++){
                total = j * i;
                System.out.print(total + " ");
                totalF = (j * i) + totalF;
            }
            System.out.println();
        } 

System.out.println("total nilai adalah: " + totalF);

    }
}