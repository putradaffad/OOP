package praktikum.Pert11.LatihanSoal3;

public final class OperasiBilanganAbstractCetak {
    private void cetakSemua(OperasiBilanganAbstract[] OB, double a, double b) {
        for (OperasiBilanganAbstract operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        OperasiBilanganAbstract[] operasi = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        double a = 6.5;
        double b = 0.5;

        OperasiBilanganAbstractCetak cetak = new OperasiBilanganAbstractCetak();
        cetak.cetakSemua(operasi, a, b);
    }
}