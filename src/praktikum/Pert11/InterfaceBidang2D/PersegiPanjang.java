package praktikum.Pert11.InterfaceBidang2D;

public class PersegiPanjang implements Bidang2D {
    public double panjang;
    public double lebar;

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }
}