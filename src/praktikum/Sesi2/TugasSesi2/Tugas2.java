
package praktikum.Sesi2.TugasSesi2;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char pilihan;
        
        // Menampilkan pesan selamat datang
        System.out.println("\n==================================================================");
        System.out.println("   Selamat Datang Di Program Kalkulator | Putra Daffa Dwiyansah");
        System.out.println("==================================================================\n");
        
        do {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("Pilih Operasi :");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus (sisa bagi)");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Exit");
            System.out.print("Masukkan pilihan (1-7) : ");
            int operasi = scan.nextInt();
            
            // Memproses berdasarkan pilihan
            if (operasi == 7) {
                System.out.println("Keluar dari program...");
                break;
            }

            // Memasukkan angka pertama
            System.out.print("Masukkan angka pertama (int/float) : ");
            double num1 = scan.nextDouble();

            // Memasukkan angka kedua
            System.out.print("Masukkan angka kedua (int/float) : ");
            double num2 = scan.nextDouble();
            
            double hasil = 0;

            // Switch untuk memilih operasi
            switch (operasi) {
                case 1:
                    hasil = num1 + num2;
                    System.out.println("Hasil penjumlahan : " + hasil);
                    break;
                case 2:
                    hasil = num1 - num2;
                    System.out.println("Hasil pengurangan : " + hasil);
                    break;
                case 3:
                    hasil = num1 * num2;
                    System.out.println("Hasil perkalian : " + hasil);
                    break;
                case 4:
                    if (num2 != 0) {
                        hasil = num1 / num2;
                        System.out.println("Hasil pembagian : " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                    }
                    break;
                case 5:
                    hasil = num1 % num2;
                    System.out.println("Hasil modulus (sisa bagi) : " + hasil);
                    break;
                case 6:
                    hasil = Math.pow(num1, num2);
                    System.out.println("Hasil perpangkatan : " + hasil);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            // Loop for untuk menghitung angka dari 1 hingga hasil pembagian
            System.out.println("\nDeret dari 1 sampai hasil dibulatkan ke bawah : ");
            for (int i = 1; i <= (int) Math.floor(hasil); i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            // Menanyakan apakah ingin mengulang kalkulasi
            System.out.println("=====================================================");
            System.out.print("Apakah ingin melakukan operasi lain (y/n)? ");
            pilihan = scan.next().charAt(0);
            
            // While untuk validasi input
            while (pilihan != 'y' && pilihan != 'n') {
                System.out.print("Input tidak valid! Masukkan (y/n) : ");
                pilihan = scan.next().charAt(0);
            }

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Terima Kasih Telah Menggunakan Program Kalkulator!");
    }
}