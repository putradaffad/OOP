package praktikum.Pert9.LatihanSoal3;

// Interface Keyboard
interface Keyboard {
    void tekan_enter();
}

// Interface Mouse
interface Mouse {
    void klik_kanan();
    void klik_kiri();
}

// Interface Printer
interface Printer {
    void cetak_data();
}

// Kelas Abstrak Komputer
abstract class Komputer implements Mouse, Keyboard, Printer {
    public abstract void hidupkan_os();
    public abstract void matikan_os();
}

// Kelas Laptop
class Laptop extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Laptop: Menghidupkan OS...");
    }

    @Override
    public void matikan_os() {
        System.out.println("Laptop: Mematikan OS...");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Laptop: Klik kanan mouse...");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Laptop: Klik kiri mouse...");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Laptop: Menekan tombol enter...");
    }

    @Override
    public void cetak_data() {
        System.out.println("Laptop: Mencetak data...");
    }
}

// Kelas Netbook
class Netbook extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Netbook: Menghidupkan OS...");
    }

    @Override
    public void matikan_os() {
        System.out.println("Netbook: Mematikan OS...");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Netbook: Klik kanan mouse...");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook: Klik kiri mouse...");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Netbook: Menekan tombol enter...");
    }

    @Override
    public void cetak_data() {
        System.out.println("Netbook: Mencetak data...");
    }
}

// Kelas PC
class Pc extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("PC: Menghidupkan OS...");
    }

    @Override
    public void matikan_os() {
        System.out.println("PC: Mematikan OS...");
    }

    @Override
    public void klik_kanan() {
        System.out.println("PC: Klik kanan mouse...");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Klik kiri mouse...");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: Menekan tombol enter...");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: Mencetak data...");
    }
}

// Kelas KomputerCetak (Main Class)
public final class KomputerTester {
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

        KomputerTester tester = new KomputerTester();
        tester.cetak(komputer);
    }
}
