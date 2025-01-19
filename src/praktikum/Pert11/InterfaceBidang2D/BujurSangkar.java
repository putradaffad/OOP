package praktikum.Pert11.InterfaceBidang2D;

public class BujurSangkar implements Bidang2D {
    public double sisi;

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }
}