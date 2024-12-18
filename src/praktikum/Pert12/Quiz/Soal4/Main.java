package praktikum.Pert12.Quiz.Soal4;

// Interface untuk perilaku jalan dan terbang
interface Perilaku {
    void berjalan();   // Method abstract untuk berjalan
    void terbang();    // Method abstract untuk terbang
}

// Abstract Class Animal
abstract class Animal {
    protected String nama, sifat;
    protected int ukuran;

    // Getter dan Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }
}

// Class Mamalia (extends Animal)
class Mamalia extends Animal implements Perilaku {
    private String jalan, jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    // Constructor
    public Mamalia(String nama) {
        this.nama = nama;
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " dapat berjalan.");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " tidak bisa terbang.");
    }
}

// Class Aves (extends Animal)
class Aves extends Animal implements Perilaku {
    protected String jenisAves, terbang;
    protected boolean bisaTerbang;

    // Constructor
    public Aves(String nama, double ukuran) {
        this.nama = nama;
        this.ukuran = (int) ukuran;
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " bisa berjalan.");
    }

    @Override
    public void terbang() {
        if (bisaTerbang) {
            System.out.println(nama + " sedang terbang.");
        } else {
            System.out.println(nama + " tidak bisa terbang.");
        }
    }
}

// Subclass Ayam (extends Aves)
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public Ayam(String nama, double ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " ayam dapat berjalan dengan cepat.");
    }
}

// Subclass Merpati (extends Aves)
class Merpati extends Aves {
    public Merpati(String nama, double ukuran) {
        super(nama, ukuran);
    }

    @Override
    public void terbang() {
        System.out.println(nama + " merpati sedang terbang tinggi.");
    }
}

// Main Class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia("Kucing");
        kucing.setBisaJalan(true);
        kucing.setJumlahKaki(4);
        kucing.setJenisMamalia("Karnivora");
        System.out.println("=== Data Mamalia ===");
        System.out.println("Nama: " + kucing.getNama());
        System.out.println("Jenis: " + kucing.getJenisMamalia());
        System.out.println("Jumlah Kaki: " + kucing.getJumlahKaki());
        kucing.berjalan();
        kucing.terbang();

        System.out.println();

        Ayam ayamKampung = new Ayam("Ayam Kampung", 2.5);
        ayamKampung.setBisaDiadu(true);
        System.out.println("=== Data Ayam ===");
        System.out.println("Nama: " + ayamKampung.getNama());
        ayamKampung.berjalan();

        System.out.println();

        Merpati merpatiPutih = new Merpati("Merpati Putih", 1.8);
        merpatiPutih.setBisaTerbang(true);
        System.out.println("=== Data Merpati ===");
        System.out.println("Nama: " + merpatiPutih.getNama());
        merpatiPutih.terbang();
    }
}
