package praktikum.Sesi7.Pegawai;

public class Manager extends Pegawai{
    
    @Override
    public void menampilkan(){
        System.out.println("Nama : "+nama);
        System.out.println("Id Pegawai : "+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }

    public void tugas(){
        System.err.println("Tugas : Melakukan manajemen untuk franchise");
        System.err.println("----------------------------------------------");
    }
}