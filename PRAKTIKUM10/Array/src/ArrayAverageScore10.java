import java.util.Scanner;

public class ArrayAverageScore10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        int[] score = new int[numStudents];
        double totalPass = 0;
        double totalFail = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();

            if (score[i] >= 70) {
                totalPass += score[i];
                passCount++;
            } else {
                totalFail += score[i];
                failCount++;
            }
        }

        double averagePass = (passCount > 0) ? totalPass / passCount : 0;
        double averageFail = (failCount > 0) ? totalFail / failCount : 0;

        System.out.println("The average score of students who passed is " + averagePass);
        System.out.println("The average score of students who failed is " + averageFail);

        sc.close();
    }
}
