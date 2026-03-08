package Tugas;

public class Mahasiswa {

    // Atribut mahasiswa (enkapsulasi)
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter untuk mengambil nilai IPK
    public double getIpk() {
        return ipk;
    }

    // Setter untuk mengubah nilai IPK
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method untuk memperbarui IPK mahasiswa
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // Method untuk mengecek kelulusan berdasarkan IPK
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // Method untuk menentukan predikat akademik
    public String hitungPredikat() {
        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat());
        System.out.println();
    }

    // Getter NIM untuk pencarian mahasiswa
    public String getNim() {
        return nim;
    }
}