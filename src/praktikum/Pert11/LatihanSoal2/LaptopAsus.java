package praktikum.Pert11.LatihanSoal2;

public class LaptopAsus extends Laptop {
    public LaptopAsus(String merk) {
        setMerk(merk); // Tetapkan merk melalui setter
    }

    @Override
    protected void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    protected String getMerk() {
        return this.merk;
    }

    @Override
    protected void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Override
    protected String getPemilik() {
        return this.pemilik;
    }

    @Override
    protected void tampil() {
        System.out.println(getPemilik() + " memiliki laptop merk " + getMerk());
    }

    @Override
    protected void hapus() {
        this.merk = null;
        this.pemilik = null;
    }
}
