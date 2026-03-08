public class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter IPK
    public double getIpk() {
        return ipk;
    }

    // Setter IPK
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    // Method update IPK
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // Method cek kelulusan
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // Menampilkan data
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + cekKelulusan());
    }
}
