public class Aplikasi{

    public static void main(String args[]){
        //System.out.println("Ajeng Tresna Azizah, kelas 4B");
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama="Ajeng Tresna Azizah";
        System.out.println(mhs.info());

        Mahasiswa mhs2 = new Mahasiswa("19092002","Ajeng Tresna Azizah","4B");
        System.out.println(mhs2.info());
        
    }
    
}