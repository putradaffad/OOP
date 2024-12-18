package praktikum.Sesi5;

class Nilai {
    private double quiz; // Atribut untuk menyimpan nilai quiz
    private double UTS;  // Atribut untuk menyimpan nilai UTS
    private double UAS;  // Atribut untuk menyimpan nilai UAS

    public void setQuiz(double quiz) { // Setter untuk mengatur nilai quiz
        this.quiz = quiz;
    }

    public void setUTS(double UTS) { // Setter untuk mengatur nilai UTS
        this.UTS = UTS;
    }

    public void setUAS(double UAS) { // Setter untuk mengatur nilai UAS
        this.UAS = UAS;
    }

    public double getQuiz() { // Getter untuk mendapatkan nilai quiz
        return quiz;
    }

    public double getUTS() { // Getter untuk mendapatkan nilai UTS
        return UTS;
    }

    public double getUAS() { // Getter untuk mendapatkan nilai UAS
        return UAS;
    }
    
    public double getNA() { // Metode untuk menghitung Nilai Akhir (NA) berdasarkan bobot
        return 0.20 * quiz + 0.30 * UTS + 0.50 * UAS;
    }
}

public class NilaiTester2 {
    public static void main(String[] args) {
        Nilai n = new Nilai(); // Membuat objek Nilai

        n.setQuiz(90);         // Menetapkan nilai quiz menjadi 90
        n.setUTS(70);          // Menetapkan nilai UTS menjadi 70
        n.setUAS(150);         // Menetapkan nilai UAS menjadi 150 (tanpa validasi)

        System.out.println("NA : " + n.getNA()); // Menampilkan Nilai Akhir (NA) berdasarkan bobot nilai
    }
}
