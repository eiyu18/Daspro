import  java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of scores: ");
        int n = sc.nextInt();
        
        int[] scores = new int[n];
        
        System.out.println("Enter each score:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        
        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;
        
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            sum += score;
        }
        
        double average = (double) sum / n;
        
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);
        
        sc.close();
    }
}
