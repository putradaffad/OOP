package praktikum.Sesi1.TugasSesi1;

import java.util.Scanner;

public class TugasAritmatik {
    public static void main(String[] args) {
       
        // Membuat scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan operasi
        System.out.println("Pilih Operasi Aritmatik : ");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        // Meminta pengguna memilih operasi
        System.out.print("Masukkan pilihan operasi (1/2/3/4) : ");
        int pilihan = input.nextInt();

        // Meminta pengguna memasukkan angka pertama
        System.out.print("Masukkan angka pertama : ");
        double angka1 = input.nextDouble();

        // Meminta pengguna memasukkan angka kedua
        System.out.print("Masukkan angka kedua : ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean valid = true;

        // Menghitung hasil berdasarkan operasi yang dipilih
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan : " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan : " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian : " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian : " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan nol!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Pilihan operasi tidak valid!");
                valid = false;
                break;
        }

        // Menampilkan hasil akhir jika operasi valid
        if (valid) {
            System.out.println("Hasil : " + hasil);
        }

        input.close();

    }
}
