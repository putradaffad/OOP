package praktikum.Pert11.PolymorfismeDinamis;

public class CetakGambar {
    public void tampil(Bentuk[] obj) {
        // Polimorfisme
        // Memanggil method yang sama (gambar & hapus) pada masing-masing subclass
        for (Bentuk bentuk : obj) {
            bentuk.gambar();
            bentuk.hapus();
        }
    }

    public static void main(String[] args) {
        Bentuk[] obj = {
            new Lingkaran(),
            new Segitiga(),
            new Elips()
        };

        CetakGambar cetak = new CetakGambar();
        cetak.tampil(obj);
    }
}