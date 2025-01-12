package praktikum.Pert5.Quiz;

public class soal4 {
    public static void main(String[] args) {
        int jumlahGenap = 0; // Variabel untuk menyimpan jumlah bilangan genap

        // Menggunakan perulangan for untuk memeriksa bilangan genap dari 1 hingga 10
        for (int i = 1; i <= 10; i++) {
            // Memeriksa apakah bilangan tersebut genap
            if (i % 2 == 0) {
                jumlahGenap += i; // Menambahkan bilangan genap ke dalam jumlah
                System.out.println("Bilangan genap: " + i);
            }
        }

        // Menampilkan jumlah total bilangan genap
        System.out.println("Jumlah bilangan genap dari 1 hingga 10 adalah: " + jumlahGenap);
    }
}