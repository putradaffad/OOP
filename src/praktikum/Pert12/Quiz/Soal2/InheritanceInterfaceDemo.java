package praktikum.Pert12.Quiz.Soal2;

// Interface transportasi
interface Transportasi {
    int idz = 0; // variabel konstanta

    void tampil(); // Method abstract
    void setData(); // Method abstract
    int getId(); // Method abstract
}

// Superclass Gojek
class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    // Implementasi method dari interface
    @Override
    public void tampil() {
        System.out.println("Gojek - Harga: " + harga + ", ID: " + id);
    }

    @Override
    public void setData() {
        this.harga = 10000; // Contoh nilai default
        this.id = 1;
    }

    @Override
    public int getId() {
        return id;
    }
}

// Subclass Bayar yang extends Gojek
class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    // Constructor
    public Bayar(String nama, int jarak) {
        this.nama = nama;
        this.jarak = jarak;
        setData(); // Set data harga dan ID dari superclass
        hitungTotal(); // Menghitung total pembayaran
    }

    // Method untuk menghitung total berdasarkan jarak
    private void hitungTotal() {
        total = jarak * harga; // Misalnya harga per km
    }

    // Method tampil untuk menampilkan informasi pembayaran
    @Override
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Harga per km: " + harga);
        System.out.println("Total Bayar: " + total);
    }

    // Method setData
    @Override
    public void setData() {
        super.setData();
        this.harga = 5000; // Harga per km khusus Bayar
    }

    // Overload method bayar
    public void bayar() {
        System.out.println("Pembayaran dilakukan oleh " + nama);
    }

    public void bayar(int id) {
        System.out.println("Pembayaran berhasil dengan ID: " + id);
    }

    // Getter ID
    @Override
    public int getId() {
        return super.getId();
    }
}

// Main class untuk menjalankan program
public class InheritanceInterfaceDemo {
    public static void main(String[] args) {
        // Membuat objek Bayar
        Bayar pembayaran = new Bayar("Putra", 10);

        // Menampilkan informasi pembayaran
        System.out.println("=== Informasi Pembayaran ===");
        pembayaran.tampil();

        // Melakukan pembayaran
        System.out.println("\n=== Proses Pembayaran ===");
        pembayaran.bayar();
        pembayaran.bayar(pembayaran.getId());
    }
}
