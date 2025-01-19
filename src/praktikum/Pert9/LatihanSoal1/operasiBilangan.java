package praktikum.Pert9.LatihanSoal1;

import java.util.Scanner;

// Kelas Induk (Superclass)
abstract class OperasiBilangan {
    protected double a, b, c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public abstract void hitung();
    public abstract void tampil();
}

// Kelas Penjumlahan
class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    public void hitung() {
        c = a + b;
    }

    @Override
    public void tampil() {
        System.out.println("Hasil Penjumlahan: " + c);
    }
}

// Kelas Pengurangan
class OperasiPengurangan extends OperasiBilangan {
    @Override
    public void hitung() {
        c = a - b;
    }

    @Override
    public void tampil() {
        System.out.println("Hasil Pengurangan: " + c);
    }
}

// Kelas Perkalian
class OperasiPerkalian extends OperasiBilangan {
    @Override
    public void hitung() {
        c = a * b;
    }

    @Override
    public void tampil() {
        System.out.println("Hasil Perkalian: " + c);
    }
}

// Kelas Pembagian
class OperasiPembagian extends OperasiBilangan {
    @Override
    public void hitung() {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
        }
    }

    @Override
    public void tampil() {
        if (b != 0) {
            System.out.println("Hasil Pembagian: " + c);
        }
    }
}

// Final Class untuk Cetak Semua Operasi
final class OperasiBilanganCetak {
    public void cetakSemua(OperasiBilangan operasi, double a, double b) {
        operasi.setA(a);
        operasi.setB(b);
        operasi.hitung();
        operasi.tampil();
    }
}

// Kelas Utama (Main Method) dengan Nama LatihanSoal2
public class operasiBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objek untuk setiap operasi
        OperasiPenjumlahan tambah = new OperasiPenjumlahan();
        OperasiPengurangan kurang = new OperasiPengurangan();
        OperasiPerkalian kali = new OperasiPerkalian();
        OperasiPembagian bagi = new OperasiPembagian();
        OperasiBilanganCetak cetak = new OperasiBilanganCetak();

        boolean lanjut = true;

        while (lanjut) {
            // Menu Operasi
            System.out.println("\n=== Program Operasi Bilangan ===");
            System.out.println("Pilih Operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = scanner.nextInt();

            // Menjalankan operasi sesuai pilihan
            if (pilihan >= 1 && pilihan <= 4) {
                // Input nilai A dan B setelah memilih operasi
                System.out.print("Masukkan nilai A: ");
                double a = scanner.nextDouble();
                System.out.print("Masukkan nilai B: ");
                double b = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        cetak.cetakSemua(tambah, a, b);
                        break;
                    case 2:
                        cetak.cetakSemua(kurang, a, b);
                        break;
                    case 3:
                        cetak.cetakSemua(kali, a, b);
                        break;
                    case 4:
                        cetak.cetakSemua(bagi, a, b);
                        break;
                }
            } else if (pilihan == 5) {
                System.out.println("Program selesai. Terima kasih!");
                lanjut = false;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        scanner.close();
    }
}
