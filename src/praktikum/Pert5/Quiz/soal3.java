package praktikum.Pert5.Quiz;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        int angka;

        // Menggunakan perulangan while untuk terus meminta angka hingga 0 dimasukkan
        do {
            // Meminta pengguna memasukkan angka
            System.out.print("Masukkan sebuah angka (0 untuk berhenti): ");
            angka = scanner.nextInt();

            // Menampilkan angka yang dimasukkan, kecuali jika angka 0
            if (angka != 0) {
                System.out.println("Anda memasukkan angka: " + angka);
            }

        } while (angka != 0); // Kondisi berhenti ketika angka 0 dimasukkan

        System.out.println("Program berhenti karena Anda memasukkan angka 0.");

        // Menutup scanner
        scanner.close();
    }
}
