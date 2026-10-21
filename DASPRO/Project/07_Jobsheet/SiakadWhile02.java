import java.util.Scanner;
public class SiakadWhile02 {
    
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    
    int i = 1;
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlah = sc.nextInt();

    while (jumlah >= i) {
        System.out.print("Masukka nilai mahasiswa ke " + i + ": ");
        int nilai = sc.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid, ulangi input: ");
            nilai = sc.nextInt();
            continue; 
        }
        else if (nilai >= 80) {
            System.out.println("Nilai mahasiswa ke " + i + " Adalah A");
            System.out.println("Bagus, pertahankan nilaimu");
        }
        else if (nilai >= 73) {
            System.out.println("Nilai mahasiswa ke " + i + " Adalah B+");
        }
        else if (nilai >= 65) {
            System.out.println("Nilai mahasiswa ke " + i + " Adalah B");
        }
        else if (nilai >= 60) {
            System.out.println("Nilai mahasiswa ke " + i + " Adalah C+");
        }
        else if (nilai >= 50) {
            System.out.println("Nilai mahasiswa ke " + i + " Adalah C");
        }
        else if (nilai >= 39) {
            System.out.println("Nilai mahasiswa ke " + i + " Adalah D");
        }
        else {
            System.out.println("Nilai mahasiswa ke " + i + " Adalah E");
        }
        i++;
    }


    }
}
