package latihan2;

public class DataDiri {
    //Atribut
    String nama;
    String npm;
    String kelas;
    
    //Konstruktor
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
    }
}
