package praktikum.Pert11.LatihanSoal1;

public class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = this.a + this.b;
    }
}