public class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // constructor
    public Mahasiswa(String nama, String nim, String jurusan, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // method cek kelulusan
    public String cekKelulusan(){
        if(ipk >= 3.00){
            return "Lulus";
        } else{
            return "Belum Lulus";
        }
    }

    // method menentukan predikat
    public String hitungPredikat(){

        if(ipk >= 3.75){
            return "Dengan Pujian";
        }
        else if(ipk >= 3.50){
            return "Sangat Memuaskan";
        }
        else if(ipk >= 3.00){
            return "Memuaskan";
        }
        else{
            return "Perlu Perbaikan";
        }
    }

    // method menampilkan data mahasiswa
    public void tampilkanInfo(){

        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat());
        System.out.println();
    }
}
