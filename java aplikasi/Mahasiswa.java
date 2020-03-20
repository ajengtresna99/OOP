public class Mahasiswa{
    //Field-Atribut-Propertis-Variabel
    String nim;
    String nama;
    String kelas;
    
    //Konstruktor
    public Mahasiswa(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
public Mahasiswa(){
    nim = "19092002";
    nama = "Ajeng Tresna Azizah";
    kelas = "4B";
}
//method-fungsi-prosedur
   public String info(){
       return nim +":"+ nama +":" + kelas;
   }
}