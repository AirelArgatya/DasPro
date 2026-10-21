import java.util.Scanner;
public class MenghitungLuasPersegiPanjang02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int panjang;
            int lebar;
            int luas;
            
            
            System.out.print("Masukkan panjang PersegiPanjang: ");
            panjang=sc.nextInt();
            System.out.print("Masukkan lebar PersegiPanjang: ");
            lebar=sc.nextInt();

    luas=panjang*lebar;
    System.out.println("Luas PersegiPanjang: "+luas);

    sc.close();
    }
}
