package praktikum.Sesi10.InheritanceBangunDatar;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    // Keliling diasumsikan segitiga sama sisi
    @Override
    public float keliling() {
        return 3 * alas;
    }
}