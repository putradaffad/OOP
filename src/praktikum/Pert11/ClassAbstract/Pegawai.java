package praktikum.Pert11.ClassAbstract;

public abstract class Pegawai {
    private String NIP;
    private String nama;

    public Pegawai(String nama, String NIP) {
        this.nama = nama;
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void kirimEmail(String to, String subjek, String isi) {
        System.out.println(getNama() + " Kirim email ke : " + to);
        System.out.println("Dengan Subjek : " + subjek);
        System.out.println("Dengan Isi : " + isi);
    }
}