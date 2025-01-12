package praktikum.Pert6.Tugas;

public class Mahasiswa {
    // Atribut dari kelas Mahasiswa
    private String nama;
    private String nim;
    private String jurusan;

    // Konstruktor untuk inisialisasi atribut kelas
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void infoMahasiswa() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Jurusan : " + this.jurusan);
    }

    // Metode utama (main) untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Putra Daffa Dwiyansah", "20230801432", "Teknik Informatika");

        // Memanggil metode infoMahasiswa untuk menampilkan data mahasiswa
        mahasiswa1.infoMahasiswa();
    }
}