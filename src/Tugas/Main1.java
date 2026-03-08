public class Main {

    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Andi Pratama","2440001","Teknik Informatika",3.75);
        Mahasiswa m2 = new Mahasiswa("Budi Santoso","2440002","Sistem Informasi",3.40);
        Mahasiswa m3 = new Mahasiswa("Citra Lestari","2440003","Teknik Informatika",3.90);
        Mahasiswa m4 = new Mahasiswa("Joni Suhartono","2440004","Teknik Industri",3.00);
        Mahasiswa m5 = new Mahasiswa("Bulan Suci","2440005","Akuntansi",3.20);

        System.out.println("=== Data Mahasiswa ===");

        m1.tampilkanInfo();
        m2.tampilkanInfo();
        m3.tampilkanInfo();
        m4.tampilkanInfo();
        m5.tampilkanInfo();
    }
}
