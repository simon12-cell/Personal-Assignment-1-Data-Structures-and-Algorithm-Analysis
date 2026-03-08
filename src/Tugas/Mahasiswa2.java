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

    // getter nim
    public String getNim(){
        return nim;
    }

    // getter ipk
    public double getIpk(){
        return ipk;
    }

    // setter ipk
    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    // method update ipk
    public void updateIpk(double ipkBaru){
        this.ipk = ipkBaru;
    }

    // cek kelulusan
    public String cekKelulusan(){
        if(ipk >= 3.00){
            return "Lulus";
        } else{
            return "Belum Lulus";
        }
    }

    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + cekKelulusan());
    }
}

