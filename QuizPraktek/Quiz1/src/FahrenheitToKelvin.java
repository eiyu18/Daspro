import java.util.Scanner;

public class FahrenheitToKelvin {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Kelvin using the formula
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

        // Format the output to 2 decimal places
        String formattedKelvin = String.format("%.2f", kelvin);

        // Print the result
        System.out.println("------------------");
        System.out.println("Temperature in Kelvin: " + formattedKelvin);

        // Close the scanner
        scanner.close();
    }
}