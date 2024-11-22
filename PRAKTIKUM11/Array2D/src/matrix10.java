import java.util.Scanner;

public class matrix10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        boolean isSymmetric = true;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - i - 1];

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                }
            }
        }

        System.out.println("\nPrimary diagonal sum: " + primaryDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
        System.out.println("Is the matrix symmetric? " + (isSymmetric ? "Yes" : "No"));

        sc.close();

    }
}
