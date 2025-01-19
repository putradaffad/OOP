package praktikum.Pert9.LatihanSoal2;

public final class Main {
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

        Main cetak = new Main();
        cetak.cetakSemua(operasi, a, b);
    }
}