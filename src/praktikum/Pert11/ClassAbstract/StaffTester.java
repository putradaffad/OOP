package praktikum.Pert11.ClassAbstract;

public class StaffTester {
    public static void main(String[] args) {
        Staff s = new Staff("Januar", "1234", "Keuangan");
        s.kirimEmail("a@test.com", "info test", "isi email");
        System.out.println("NIP    : " + s.getNIP());
        System.out.println("Nama   : " + s.getNama());
        System.out.println("Bagian : " + s.getBagian());
    }
}