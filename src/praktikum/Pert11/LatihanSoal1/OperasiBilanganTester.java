package praktikum.Pert11.LatihanSoal1;

public class OperasiBilanganTester {
    public static void main(String[] args) {
        double A = 10.5, B = 0.5;

        OperasiPenjumlahan penjumlahan = new OperasiPenjumlahan();
        penjumlahan.set_A(A);
        penjumlahan.set_B(B);
        penjumlahan.set_C();
        System.out.print("Penjumlahan: ");
        penjumlahan.tampil();

        OperasiPengurangan pengurangan = new OperasiPengurangan();
        pengurangan.set_A(A);
        pengurangan.set_B(B);
        pengurangan.set_C();
        System.out.print("Pengurangan: ");
        pengurangan.tampil();

        OperasiPerkalian perkalian = new OperasiPerkalian();
        perkalian.set_A(A);
        perkalian.set_B(B);
        perkalian.set_C();
        System.out.print("Perkalian: ");
        perkalian.tampil();

        OperasiPembagian pembagian = new OperasiPembagian();
        pembagian.set_A(A);
        pembagian.set_B(B);
        pembagian.set_C();
        System.out.print("Pembagian: ");
        pembagian.tampil();
    }
}