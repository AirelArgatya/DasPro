import java.util.Scanner;
public class studiKasus2_02 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

//dokumen max = 4
//juara yang masuk <= 3
//PKM harus lolos pendanaan



        System.out.print("Masukkan Nama Anda    : ");
        String nama = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINYA): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah Dokumen Yang Di-Upload: ");
        int dokumen = sc.nextInt();

        System.out.print("Peringkat Juara       : ");
        int juara = sc.nextInt();

        System.out.print("Status Pendanaan PKM (1 = Lolos, 0 = Tidak): ");
        int status = sc.nextInt();

System.out.println("Nama Peserta    : " + nama);
System.out.println("Jenis Kegiatan  : " + jenisKegiatan);
System.out.println("Jumlah Dokumen  : " + dokumen);
System.out.println("Peringkat Juara : " + juara);

if (status == 1 ) {
    System.out.println("Status PKM      : Valid" );
}
else if (status == 0) {
    System.out.println("Status PKM      : inValid" );
}

if (jenisKegiatan.equalsIgnoreCase("BELMAWA")) {
    if (dokumen == 4 && juara <= 3) {
        System.out.println("Data Valid, Anda Lolos");
    } else {
        System.out.println("Data inValid, Anda Tidak Lolos");
    }
}
else if (jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
    if (dokumen == 4 && juara <= 3) {
        System.out.println("Data Valid, Anda Lolos");
    } else {
            System.out.println("Data inValid, Anda Tidak Lolos");
        }
}
else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
    if (dokumen == 4 && juara <= 3) {
        if (status == 1) {
        System.out.println("Data Valid, Anda Lolos");
    } else {
        System.out.println("Data inValid, Anda Tidak Lolos");
    }
    }
}
else if (jenisKegiatan.equalsIgnoreCase("LAINYA")) {
    System.out.println("Tidak Masuk Kategori");
}
else {
    System.out.println("Tidak Termasuk Kategori");
}


    }
}
