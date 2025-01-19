package praktikum.Pert13;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp='" + nrp + '\'' + ", nama='" + nama + '\'' + '}';
    }

    @Override
    public int compareTo(Mahasiswa other) {
        return this.nama.compareTo(other.nama);
    }
}
