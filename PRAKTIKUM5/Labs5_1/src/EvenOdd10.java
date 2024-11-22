import java.util.Scanner;
public class EvenOdd10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input an integer number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The "+number+" is even number" );
        } else {
            System.out.println("The "+number+" is even odd number" );
        }
    }
}
