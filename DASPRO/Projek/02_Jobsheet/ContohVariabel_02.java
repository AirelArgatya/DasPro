public class ContohVariabel_02 {
    public static void main(String[] args) {

        String salahSatuHoby = "BermainPetakUmpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(salahSatuHoby);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSaya);
        System.out.println(String.format("Saya memiliki IPK %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
