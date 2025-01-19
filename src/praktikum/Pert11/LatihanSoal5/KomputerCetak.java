package praktikum.Pert11.LatihanSoal5;

public final class KomputerCetak {
    public void cetak(Komputer[] obj) {
        for (Komputer komputer : obj) {
            komputer.hidupkan_os();
            komputer.klik_kanan();
            komputer.klik_kiri();
            komputer.tekan_enter();
            komputer.cetak_data();
            komputer.matikan_os();
            System.out.println("============================");
        }
    }

    public static void main(String[] args) {
        Komputer[] komputer = {
            new Pc(),
            new Laptop(),
            new Netbook()
        };

        KomputerCetak cetak = new KomputerCetak();
        cetak.cetak(komputer);
    }
}