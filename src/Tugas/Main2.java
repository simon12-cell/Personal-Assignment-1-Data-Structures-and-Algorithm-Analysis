import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Mahasiswa[] daftar = new Mahasiswa[5];

        daftar[0] = new Mahasiswa("Andi Pratama","2440001","Teknik Informatika",3.75);
        daftar[1] = new Mahasiswa("Budi Santoso","2440002","Sistem Informasi",3.40);
        daftar[2] = new Mahasiswa("Citra Lestari","2440003","Teknik Informatika",3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono","2440004","Teknik Industri",3.00);
        daftar[4] = new Mahasiswa("Bulan Suci","2440005","Akuntansi",3.20);

        // tampilkan data mahasiswa terlebih dahulu
        System.out.println("=== Data Mahasiswa ===\n");

        for(int i = 0; i < daftar.length; i++){
            daftar[i].tampilkanInfo();
            System.out.println();
        }

        // input update IPK
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();

        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = input.nextDouble();

        for(int i = 0; i < daftar.length; i++){

    if(daftar[i].getNim().equals(nimCari)){
        daftar[i].setIpk(ipkBaru); 
        System.out.println("\nData berhasil diperbarui!\n");
        System.out.println("=== Data Mahasiswa ===\n");
        daftar[i].tampilkanInfo();
            }
        }

        input.close();
    }
}
