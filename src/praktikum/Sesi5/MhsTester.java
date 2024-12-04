package praktikum.Sesi5;

class Mahasiswa {
    public String nama;
    protected int usia;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter untuk atribut private jurusan
    public String getJurusan() {
        return jurusan;
    }

    // Setter untuk atribut private jurusan
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Jurusan : " + jurusan);
    }
}

public class MhsTester {
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 20, "Teknik Informatika");

        //Mengakses atribut public
        System.out.println("Nama : " + mahasiswa1.nama);

        // Mengakses atribut protected
        System.out.println("Usia : " + mahasiswa1.usia);

        //  Mengakses atribut private
        System.out.println("Jurusan : " + mahasiswa1.getJurusan());

        // Mengubah atribut private
        mahasiswa1.setJurusan("Sistem Informasi");
        System.out.println("Jurusan Mahasiswa Setelah Diubah    : " + mahasiswa1.getJurusan());  
    }
}