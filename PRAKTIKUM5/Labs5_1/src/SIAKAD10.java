import java.util.Scanner;

public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        String Nama, NIM, Nilai_Akhir_Huruf = "", kualifikasi = "";
        char Kelas;
        byte Absen;
        double Nilai_Kuis, Nilai_Tugas, Nilai_Ujian, Nilai_Akhir;

        // Input collection
        System.out.print("Masukkan nama: ");
        Nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM: ");
        NIM = scanner.nextLine();
        
        System.out.print("Masukkan kelas: ");
        Kelas = scanner.next().charAt(0);
        
        System.out.print("Masukkan nomor absen: ");
        Absen = scanner.nextByte();
        
        System.out.print("Masukkan nilai kuis: ");
        Nilai_Kuis = scanner.nextDouble();
        
        System.out.print("Masukkan nilai tugas: ");
        Nilai_Tugas = scanner.nextDouble();
        
        System.out.print("Masukkan nilai ujian: ");
        Nilai_Ujian = scanner.nextDouble();

        // Calculate final grade
        Nilai_Akhir = (Nilai_Kuis + Nilai_Tugas + Nilai_Ujian) / 3.0;

        // Determine letter grade and qualification
        if (Nilai_Akhir >= 85 && Nilai_Akhir <=100) {
            Nilai_Akhir_Huruf = "A";
                kualifikasi = "Sangat Baik";
        } else if (Nilai_Akhir >= 73 && Nilai_Akhir <80) {
            Nilai_Akhir_Huruf = "B+";
                kualifikasi = "Lebih Dari Baik";
        } else if (Nilai_Akhir >= 65 && Nilai_Akhir <=73) {
            Nilai_Akhir_Huruf = "B";
                kualifikasi = "Baik";
        } else if (Nilai_Akhir >= 60 && Nilai_Akhir <=65) {
            Nilai_Akhir_Huruf = "C+";
                kualifikasi = "Lebih Dari Cukup";
        } else if (Nilai_Akhir >= 50 && Nilai_Akhir <=60) {
            Nilai_Akhir_Huruf = "C";
                kualifikasi = "Cukup";
        } else if (Nilai_Akhir >= 39 && Nilai_Akhir <=50) {
            Nilai_Akhir_Huruf = "D";
                kualifikasi = "Kurang";
            }else if (Nilai_Akhir <39) {
                Nilai_Akhir_Huruf = "E";
                kualifikasi = "Gagal";
            }    
        // Output
        System.out.println("Mahasiswa dengan nama " + Nama + " (NIM " + NIM + ") kelas " + Kelas + " nomor absen " + Absen);
        System.out.println("Nilai akhir: " + Nilai_Akhir);
        System.out.println("Nilai akhir huruf: " + Nilai_Akhir_Huruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        scanner.close();
    }
}