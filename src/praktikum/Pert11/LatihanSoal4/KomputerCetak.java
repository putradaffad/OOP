package praktikum.Pert11.LatihanSoal4;

public final class KomputerCetak {
    public void cetakSemua(Komputer[] obj) {
        for (Komputer komputer : obj) {
            komputer.hidupkan_os();
            komputer.klik_kiri();
            komputer.klik_kanan();
            komputer.tekan_enter();
            komputer.cetak_data();
            komputer.matikan_os();
            System.out.println("=========================");
        }
    }

    public static void main(String[] args) {
        Komputer[] daftarKomputer = {
            new Pc(),
            new Laptop(),
            new Netbook()
        };

        KomputerCetak cetak = new KomputerCetak();
        cetak.cetakSemua(daftarKomputer);
    }
}