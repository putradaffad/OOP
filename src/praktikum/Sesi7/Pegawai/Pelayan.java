package praktikum.Sesi7.Pegawai;

public class Pelayan extends Pegawai{
    @Override
    public void menampilkan()
    {
        System.out.println("Nama : "+nama);
        System.out.println("Id Pegawai : "+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }

    public void tugas(){
        System.out.println("Tugas : Melayani dan menyajikanpesanan pembeli");
        System.out.println("-----------------------------------------------");
    }
}