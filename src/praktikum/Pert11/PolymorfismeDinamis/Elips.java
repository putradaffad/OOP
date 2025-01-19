package praktikum.Pert11.PolymorfismeDinamis;

public class Elips extends Bentuk {
    @Override
    protected void gambar() {
        System.out.println("subclass -> Menggambar Elips");
    }

    @Override
    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar Elips");
    }
}