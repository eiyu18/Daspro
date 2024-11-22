import java.util.Scanner;

public class Triangle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sudut1,sudut2,sudut3;

        System.out.print("Masukan sudut 1 : ");
        sudut1 = sc.nextInt();

        System.out.print("Masukan sudut 2 : ");
        sudut2 = sc.nextInt();

        System.out.print("Masukan sudut 3 : " );
        sudut3 = sc.nextInt();

        if (sudut1 + sudut2 + sudut3 == 180) {
            if (sudut1 == sudut2 && sudut1 == sudut3)
                System.out.println("Segitiga sama sisi");
        }else if (sudut1 == sudut2 && sudut1 == sudut3) {
            System.out.println("Segitiga siku-siku");
        }else if (sudut1 > 90 || sudut2 > 90 || sudut3 > 90) {
            System.out.println("Segitiga tumpul");
        }else if (sudut1 < 90 || sudut2 < 90 || sudut3 < 90) {
            System.out.println("Segitiga lancip");
        }else {
            System.out.println("Bukan segitiga");
        }
    } 
}
