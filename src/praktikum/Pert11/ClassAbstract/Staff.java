package praktikum.Pert11.ClassAbstract;

public class Staff extends Pegawai {
    private String bagian;

    public Staff(String nama, String NIP, String bagian) {
        super(nama, NIP);
        setBagian(bagian);
    }

    public void setBagian(String namaBagian) {
        bagian = namaBagian;
    }

    public String getBagian() {
        return bagian;
    }
}