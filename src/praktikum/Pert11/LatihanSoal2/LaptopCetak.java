package praktikum.Pert11.LatihanSoal2;

public final class LaptopCetak {
    private final String barang = "Laptop";

    public void cetak(Laptop[] ob, String pemilik) {
        System.out.println("Nama Barang: " + barang);
        System.out.println("=============================");

        // Polimorfisme
        for (int i = 0; i < ob.length; i++) {
            ob[i].setPemilik(pemilik);
            ob[i].tampil();
            ob[i].hapus();
            System.out.println("=============================");
        }

       
    }

    public static void main(String[] args) {
        String pemilik = "Ahmad";
        Laptop[] ob = {
            new LaptopAsus("Asus"),
            new LaptopDell("Dell"),
            new LaptopToshiba("Toshiba")
        };

        LaptopCetak abc = new LaptopCetak();
        abc.cetak(ob, pemilik);
    }
}