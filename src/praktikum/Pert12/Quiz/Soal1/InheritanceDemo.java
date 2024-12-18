package praktikum.Pert12.Quiz.Soal1;

// Kelas Dosen (Superclass)
class Dosen {
    private String nik;
    private String nama;

    // Constructor
    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Getter NIK
    public String getNik() {
        return nik;
    }

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Method untuk menampilkan informasi Dosen
    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}

// Kelas Rektor (Subclass dari Dosen)
class Rektor extends Dosen {
    private int tahunMasuk;

    // Constructor
    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    // Getter Tahun Masuk
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // Method untuk menampilkan informasi Rektor
    public void viewRektor() {
        super.view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

// Kelas Dekan (Subclass dari Dosen)
class Dekan extends Dosen {
    private String fakultas;

    // Constructor
    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    // Getter Fakultas
    public String getFakultas() {
        return fakultas;
    }

    // Method untuk menampilkan informasi Dekan
    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);
    }
}

// Main Class untuk menjalankan program
public class InheritanceDemo {
    public static void main(String[] args) {
        // Membuat objek Rektor
        Rektor rektor = new Rektor("12345", "Dr. Putra", 2023);
        System.out.println("=== Informasi Rektor ===");
        rektor.viewRektor();

        // Membuat objek Dekan
        Dekan dekan = new Dekan("67890", "Prof. Daffa", "Fasilkom");
        System.out.println("\n=== Informasi Dekan ===");
        dekan.viewDekan();
    }
}

