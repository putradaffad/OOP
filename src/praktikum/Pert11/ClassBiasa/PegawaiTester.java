package praktikum.Pert11.ClassBiasa;

public class PegawaiTester {
    public static void main(String[] args) {
        Pegawai p = new Pegawai("Januar", "1234");
        p.kirimEmail("a@test.com", "judul", "isi email");
    }
}