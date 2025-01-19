package praktikum.Pert11.LatihanSoal5;

public class Laptop extends Komputer {
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