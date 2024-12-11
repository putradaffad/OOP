package praktikum.Sesi5;

public class Waktu {
    // Atribut
    private int menitWaktu;
    
    // Constructor
    public Waktu(int menitWaktu) {
        this.menitWaktu = menitWaktu;
    }

    // Method getJam() : Mengambil bagian jam dari menitWaktu
    public int getJam() {
        return menitWaktu / 60;
    }

    // Method getMenit() : Mengambil bagian menit dari menitWaktu
    public int getMenit() {
        return menitWaktu % 60;
    }

    // Method setJam(int j) : Menambahkan j*60 menit ke menitWaktu tanpa mempengaruhi bagian menitnya
    public void setJam(int j) {
        menitWaktu = (j * 60) + (menitWaktu % 60);
    }

    // Method setMenit(int m) : Menambahkan m menit ke menitWaktu tanpa mempengaruhi bagian jamnya
    public void setMenit(int m) {
        menitWaktu = ((menitWaktu / 60) * 60) + m;
    }

    // Method getTotalMenit() : Mengambil nilai dari menitWaktu
    public int getTotalMenit() {
        return menitWaktu;
    }
    
    // Method main untuk uji coba
    public static void main(String[] args) {
        Waktu waktu = new Waktu(125); // 125 menit dari jam 00:00
        
        System.out.println("Jam: " + waktu.getJam()); // Output: 2
        System.out.println("Menit: " + waktu.getMenit()); // Output: 5
        waktu.setJam(3); // Mengatur jam menjadi 3, menit tetap 5
        System.out.println("Setelah setJam(3) - Total Menit: " + waktu.getTotalMenit()); // Output: 185
        waktu.setMenit(30); // Mengatur menit menjadi 30, jam tetap 3
        System.out.println("Setelah setMenit(30) - Total Menit: " + waktu.getTotalMenit()); // Output: 210
    }
}
