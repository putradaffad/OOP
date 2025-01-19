package praktikum.Pert11.PolymorfismeStatis;

public class Lingkaran {
    // Method menghitung luas dengan jari-jari
    float luas(float r) {
        return (float) (Math.PI * r * r);
    }

    // Method menghitung luas dengan diameter
    double luas(double d) {
        return (double) (1 / 4.0 * Math.PI * d * d);
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();

        // Menghitung luas dengan jari-jari
        float jariJari = 7;
        System.out.println("Luas Lingkaran dengan jari-jari " + jariJari + ": " + lingkaran.luas(jariJari));

        // Menghitung luas dengan diameter
        double diameter = 14;
        System.out.println("Luas Lingkaran dengan diameter " + diameter + ": " + lingkaran.luas(diameter));
    }
}