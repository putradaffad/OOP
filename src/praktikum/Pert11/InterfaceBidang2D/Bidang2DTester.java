package praktikum.Pert11.InterfaceBidang2D;

public class Bidang2DTester {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.radius = 10;
        System.out.println("Lingkaran dengan radius " + l.radius);
        System.out.println("Luas: " + l.getLuas() + " Keliling: " + l.getKeliling());

        BujurSangkar b = new BujurSangkar();
        b.sisi = 15;
        System.out.println("Bujursangkar dengan sisi " + b.sisi);
        System.out.println("Luas: " + b.getLuas() + " Keliling: " + b.getKeliling());

        PersegiPanjang p = new PersegiPanjang();
        p.panjang = 5;
        p.lebar = 6;
        System.out.println("Persegi Panjang dengan panjang " + p.panjang + " dan lebar " + p.lebar);
        System.out.println("Luas: " + p.getLuas() + " Keliling: " + p.getKeliling());
    }
}