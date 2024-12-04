package praktikum.Sesi10.InheritanceBangunDatar;

public class Persegi extends BangunDatar {
    float sisi;

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}
