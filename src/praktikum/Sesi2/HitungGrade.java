package praktikum.Sesi2;

import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        //Membuat variabel  dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //Mengambil input
        System.out.print("Inputkan Nilai : ");
        nilai = scan.nextInt();

        //Menghitung grade
        if(nilai>= 90){
            grade = "A";
        }else if (nilai >= 80){
            grade = "B+";
        }else if (nilai >= 70){
            grade = "B";
        }else if (nilai >= 60){
            grade = "C+";
        }else if (nilai >= 50){
            grade = "C";
        }else if (nilai >= 40){
            grade = "D";
        }else{
            grade = "E";
        }

        //Cetak Hasil
        System.out.println("Grade : " + grade);
        
        scan.close();
    }
}
