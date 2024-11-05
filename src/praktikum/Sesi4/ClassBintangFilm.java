package praktikum.Sesi4;

class BintangFilm{
    //atributnya
    private String nama;
    private Boolean pria;

    //konstruktor : fungsi yang dijalankan ketika objek diciptakan
    BintangFilm(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    //Method tanpa return dengan parameter (diubah menjadi public agar bisa diakses jika diperlukan)
    public void Isikan(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    //method dengan return tanpa parameter
    String perolehNama(){
        return nama;
    }

    String perolehJenisKelamin(){
        if(pria)
            return "Pria";
        else
            return "Wanita";
    }
}

public class ClassBintangFilm {
    public static void main(String[] args) {
        BintangFilm siA = new BintangFilm ("Budi", true);
        BintangFilm siB = new BintangFilm ("Hani", false);

        System.out.println("si A => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("si B => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}
