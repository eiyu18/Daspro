import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your numerical grade: ");
        double grade = scanner.nextDouble();
        
        String letterGrade;
        double nilaiSetara;
        String kualifikasi;

        if (grade > 80 && grade <= 100) {
            letterGrade = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat Baik";
        } else if (grade > 73 && grade <= 80) {
            letterGrade = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (grade > 65 && grade <= 73) {
            letterGrade = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik";
        } else if (grade > 60 && grade <= 65) {
            letterGrade = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (grade > 50 && grade <= 60) {
            letterGrade = "C";
            nilaiSetara = 2.0;
            kualifikasi = "Cukup";
        } else if (grade > 39 && grade <= 50) {
            letterGrade = "D";
            nilaiSetara = 1.0;
            kualifikasi = "Kurang";
        } else {
            letterGrade = "Fail";
            nilaiSetara = 0.0;
            kualifikasi = "Gagal";
        }

        System.out.println("Nilai Huruf: " + letterGrade);
        System.out.println("Nilai Setara: " + nilaiSetara);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}