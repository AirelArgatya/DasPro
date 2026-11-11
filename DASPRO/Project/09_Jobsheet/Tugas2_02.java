import java.util.Scanner;

public class Tugas2_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000, 8000, 18000, 20000
        };

        String key;
        int jumlah;
        int total = 0;
        String[] simpan = new String[100];
        int tSimp = 0;

        System.out.println("=== DAFTAR MENU ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " - " + harga[i]);
            System.out.println("Ketik batal untuk stop");
        }

        do {
            System.out.print("\nMau pesan apa? ");
            key = sc.nextLine();

            if (key.equalsIgnoreCase("batal")) {
                break;
            }

            boolean data = false;

            for (int i = 0; i < menu.length; i++) {

                if (key.equalsIgnoreCase(menu[i])) {

                    System.out.println("Menu ditemukan: " + menu[i]);
                    System.out.println("Harga: " + harga[i]);

                    System.out.print("Mau pesan berapa? ");
                    jumlah = Integer.parseInt(sc.nextLine());

                    total += harga[i] * jumlah;

                    data = true;
                    
                    simpan[tSimp] = menu[i];
                    tSimp++;

                    break;
                }
            }

            if (data == false) {
                System.out.println("Menu tidak ditemukan!");
            }

        } while (true);

        System.out.println("\n=== TOTAL PESANAN ===");
        System.out.println("Total harga: " + total);

        for (int l = 0; l < tSimp; l++) {
            System.out.println("pesanan ke anda" + " adalah: " + simpan[l]);
        }


        sc.close();
    }
}
