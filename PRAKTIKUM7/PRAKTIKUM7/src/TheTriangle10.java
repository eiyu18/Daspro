import java.util.Scanner;

public class TheTriangle10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numinput;
        String s = "*";

        System.out.print("Input some number : ");
        numinput = input.nextInt();

        int i = 1; 
        while (i <= numinput) {
            int j = 1;
            while (j <= i) {
                System.out.print(s);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
