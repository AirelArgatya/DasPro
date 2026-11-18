import java.util.Scanner;

public class surveyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 6;
        int jawaban;
        int status = 0;
        int total = 0;
        int total2 = 0;
        double rata;
        double rata2;

        int survey[][] = new int[a][b];

        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < b; j++) {
                if (status == 0) {
                    System.out.println("Pelanggan ke - " + (i + 1));
                } 
                status = 1;
                System.out.print("Berapa skor pertanyaan ke " + (j + 1) + " : ");
                survey[i][j] = sc.nextInt();

                if (survey[i][j] > 5) do {
                    System.out.println("Masukkan angka (1 - 5) ");
                    System.out.print("Berapa skor pertanyaan ke " + (j + 1) + " : ");
                    survey[i][j] = sc.nextInt();
                } while (survey[i][j] > 5);

                total += survey[i][j];
                total2 += survey[i][j];
            }
            rata = (double) total / (double) 6;
            System.out.println();
            System.out.println("Rata-Rata pelanggan ke - " + (i + 1) + " : " + rata);
            System.out.println();
            status = 0;
            total -= total;
        }

        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                if (status == 0) 
                do {
                    System.out.print("Nilai Pelanggan ke " + (i + 1) + " adalah: ");
                } while (status == 1);

                status = 1;
                System.out.print(survey[i][j] + " ");
                
            }
            System.out.println();
            status = 0;
        }

        rata2 = (double) total2 / (double) (a * b);
        System.out.println("Rata Rata nilai semua customer adalah: " + rata2);

        sc.close();
    }
}

    

