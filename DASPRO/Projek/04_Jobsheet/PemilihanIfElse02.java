import java.util.Scanner;

public class PemilihanIfElse02 {
    
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print("Masukkan semester saat ini: ");
    int semester = sc.nextInt();

    if (semester == 1) {
    System.out.println("KRS Semester 1 ditampilkan");
    }
    if (semester == 2) {
    System.out.println("KRS Semester 2 ditampilkan");
    }
    if (semester == 3) {
    System.out.println("KRS Semester 3 ditampilkan");
    }
    if (semester == 4) {
    System.out.println("KRS Semester 4 ditampilkan");
    }
    if (semester == 5) {
    System.out.println("KRS Semester 5 ditampilkan");
    } 
    if (semester == 6) {
    System.out.println("KRS Semester 6 ditampilkan");
    }
    if (semester == 7) {
    System.out.println("KRS Semester 7 ditampilkan");
    }
    if (semester == 8) {
    System.out.println("KRS Semester 8 ditampilkan");
    }
    else if (semester > 8 || semester <= 0) {
    System.out.println("KRS Ands tidak valid");
    }
    else {
    System.out.println("KRS Ands tidak valid");
    }
    sc.close();
    }
}
