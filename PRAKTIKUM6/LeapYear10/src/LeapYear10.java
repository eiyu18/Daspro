import java.util.Scanner;

public class LeapYear10 {
    public static void main(String[] args) throws Exception {
        Scanner InputYear = new Scanner(System.in);
        System.out.print("Enter Year :");
        int year = InputYear.nextInt();
        System.out.println("You entered :" + year);

        if ((year % 4) == 0 ) {
            if ((year % 100) == 0) {
                if ((year % 1000) == 0)
                    System.out.println("Leap Year");
                else
                System.out.println("Not A Leap Year");
            } else
                 System.out.println("Leap Year"); 
        
        } else 
          System.out.println("");
    }      
}