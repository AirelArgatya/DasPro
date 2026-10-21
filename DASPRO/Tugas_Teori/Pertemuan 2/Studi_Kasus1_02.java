import java.util.Scanner;

public class Studi_Kasus1_02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

        /* Pak Adi mempunyai sebuah kebun berbetuk persegi Panjang.
        Pak Adi ingin membuatkan pagar kayu untuk mengelilingi kebun tersebut. 
        Sebelum membuat program untuk membantu pak adi 
        menghitung keliling kebunnya, 
        maka bantulah pak adi untuk mengidentifikasi 
        variable dan tipe data beserta algoritmanya! */
       

// Misal Panjang dan Lebranya:
   
    int Panjang = 12;
    int Lebar = 15;

    System.out.println("\nPanjang kebun Pak Adi adalah: " + Panjang + " meter");
    System.out.println("Lebar kebun Pak Adi adalah: " + Lebar + " meter");


    System.out.println("\nRumus keliling persegi panjang adalah 2 * (Panjang + Lebar)");
    int keliling = 2 * (Panjang + Lebar);

    System.out.println("\nKeliling kebun Pak Adi adalah: " + keliling);

    }
}