package praktikum.Pert11.PolymorfismeStatis;

public class Overloading {
    // Method tanpa parameter
    public void Tampil() {
        System.out.println("I love Java");
    }

    // Method dengan 1 parameter
    public void Tampil(int i) {
        System.out.println("Method dengan 1 parameter = " + i);
    }

    // Method dengan 2 parameter
    public void Tampil(int i, int j) {
        System.out.println("Method dengan 2 parameter = " + i + " & " + j);
    }

    // Method dengan parameter string
    public void Tampil(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Overloading objek = new Overloading();

        // Memanggil method Tampil() dengan berbagai parameter
        objek.Tampil();
        objek.Tampil(8);
        objek.Tampil(6, 7);
        objek.Tampil("Hello world");
    }
}