package praktikum.Sesi5;

class Siswa {
    private String nama;
    private int nilaiUjian;

    //Constructor
    public Siswa(String nama, int nilaiUjian) {
        this.nama = nama;
        setNilaiUjian(nilaiUjian);
    }

    //Getter untuk nama
    public String getNama() {
        return nama;
    }

    //Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter untuk nilaiUjian
    public int getNilaiUjian() {
        return nilaiUjian;
    }

    //Setter untuk nilaiUjian
    public void setNilaiUjian(int nilaiUjian) {
        if(nilaiUjian >= 0 && nilaiUjian <= 100) {
            this.nilaiUjian = nilaiUjian;
        } else {
            System.out.println("Nilai ujian harus diantara 0 dan 100");
        }
    }

    //Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Ujian : " + nilaiUjian);
    }

}

public class SiswaTester {
    public static void main(String[] args){
        // Membuat objek siswa
        Siswa siswa1 = new Siswa("Andi", 80);
        siswa1.tampilkanInfo();

        //Menggunakan setter untuk mengubah nama dan nilai ujian
        siswa1.setNama("Budi");
        siswa1.setNilaiUjian(95);

        //Menampilkan informasi setelah diubah
        System.out.println("Informasi setelah diubah");
        siswa1.tampilkanInfo();

        // Menguji validasi dengan memasukan nilai tidak valid
        siswa1.setNilaiUjian(120);
    }
}