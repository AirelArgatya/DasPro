import java.util.Scanner;
public class Tugas1_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int mhs;
    int total = 0;
    int nilaiTinggi = 0;
    int nilaiTinggi2 = 0;
    double rata = 0;
    int tempt;
    int lulus = 75;
    int i;

    System.out.print("Masukkan jumlah mahasiswa anda: ");
    mhs = sc.nextInt();


    int[] mahasiswa = new int [mhs];

    
    for (i = 0; i <= mahasiswa.length - 1; i++) {
        System.out.print("Masukkan nilai mahasiswa ke " + (i + 1) + ": ");
        mahasiswa[i] = sc.nextInt();
        

        if (mahasiswa[i] > 100) do {
            System.out.print("Input salah, Masukkan nilai mahasiswa ke " + (i + 1) + ": ");
            mahasiswa[i] = sc.nextInt();
            total += mahasiswa[i];
        } while (mahasiswa[i] > 100);

        else {
            total += mahasiswa[i];
        }
        

        if (mahasiswa[i] >nilaiTinggi) {
            nilaiTinggi = mahasiswa[i];
        }
    }
        
    

    rata = (double) total / mahasiswa.length;

    System.out.println("Rata-Rata Nilai: " + rata);
    System.out.println("Nilai Tertinggi adalah: " + nilaiTinggi);
    
    
    for (int j = 0; j <= mahasiswa.length - 1; j++) {
        boolean flag = false;
        for (int k = 0; k <= mahasiswa.length - 2; k++ ) {
            tempt = mahasiswa[k];
            if (mahasiswa[k+1] > mahasiswa[k]) {
                mahasiswa[k] = mahasiswa[k+1];
                mahasiswa[k+1] = tempt;
                flag = true;
            }
        }
        if (flag == false) {
            break;
        }    
    }

    for (int l = 0; l <= mahasiswa.length - 1; l++) {
        if (mahasiswa[l] > lulus) {
            System.out.println("nilai mahasiswa ke " + (l + 1) + "adalah: " + mahasiswa[l] + " lulus");
        }
        else {
            System.out.println("nilai mahasiswa ke " + (l + 1) + "adalah: " + mahasiswa[l] + " tidak lulus");
        }
    }

    }
}
