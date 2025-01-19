package praktikum.Pert11.LatihanSoal2;

public abstract class Laptop {
    // Atribut
    protected String merk, pemilik;

    // Abstract Method
    protected abstract void setMerk(String merk);
    protected abstract String getMerk();
    protected abstract void setPemilik(String pemilik);
    protected abstract String getPemilik();
    protected abstract void tampil();
    protected abstract void hapus();

    // Method biasa
    protected void hidupkanLaptop() {
        System.out.println("Hidupkan Laptop");
    }
}