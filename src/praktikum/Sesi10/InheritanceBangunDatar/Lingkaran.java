package praktikum.Sesi10.InheritanceBangunDatar;

public class Lingkaran extends BangunDatar {
    float r;

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
