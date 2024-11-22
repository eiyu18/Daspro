import java.util.Scanner;
public class CondWithIF10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 5) {
            System.out.println("Weekday");
        } else if (number == 6 || number == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        scanner.close();
    } 
}
