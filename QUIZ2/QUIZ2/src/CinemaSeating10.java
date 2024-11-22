import java.util.Scanner;

public class CinemaSeating10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] audience = new int[5][5];
        int row, column, action;
        boolean running = true;
        
        while (running) {
            System.out.println("Current Avaialble Seats: ");
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j <audience[i].length; j++) {
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Menu: ");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            action = sc.nextInt();

            switch (action) {
                case 1:
                    System.out.print("Enter row number (0-4): ");
                    row = sc.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    column = sc.nextInt();
                    sc.nextLine();

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        if (audience[row][column] == 0) { 
                            audience[row][column] = 1; 
                            System.out.println("Seat successfully booked.");
                        } else {
                            System.out.println("Seat already booked. Please choose a different seat.");
                        }
                    } else {
                        System.out.println("Invalid seat location. Please try again.");
                    }
                    break;

                    case 2:
                    System.out.print("Enter row number (0-4): ");
                    row = sc.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    column = sc.nextInt();
                
                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        if (audience[row][column] == 1) {
                            audience[row][column] = 0;
                            System.out.println("Booking successfully cancelled.");
                        } else {
                            System.out.println("Seat is not booked. Nothing to cancel.");
                        }
                    } else {
                        System.out.println("Invalid seat location. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program. Thank you!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again."); 
            }
        }
    }
}
