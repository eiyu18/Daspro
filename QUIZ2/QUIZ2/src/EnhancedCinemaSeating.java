import java.util.Scanner;

public class EnhancedCinemaSeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] audience = new int[5][5];
        int row, column, action;
        int bookedSeats = 0;
        int earnings = 0;
        int seatPrice = 0; 
        int vipPrice = 20, regularPrice = 15, economyPrice = 10;
        int availableSeats = audience.length * audience[0].length - bookedSeats;
        boolean running = true;

        while (running) {
            System.out.println("Current Seating arrangement:");
            for (int i = 0; i < audience.length; i++) {
                for (int j = 0; j < audience[i].length; j++) {
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Total Booked Seats: " + bookedSeats);
            System.out.println("Total Available Seats: " + availableSeats);
            System.out.println("Total Earnings: $" + earnings);

            System.out.println("Menu:");
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

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        if (audience[row][column] == 0) {
                            if (row < 2) {
                                seatPrice = vipPrice; 
                            } else if (row < 4) {
                                seatPrice = regularPrice; 
                            } else {
                                seatPrice = economyPrice;
                            }

                            audience[row][column] = 1;
                            bookedSeats++;
                            availableSeats--;
                            earnings += seatPrice;
                            System.out.println("Seat successfully booked. Price: $" + seatPrice);
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
                            if (row < 2) {
                                seatPrice = vipPrice; 
                            } else if (row < 4) {
                                seatPrice = regularPrice; 
                            } else {
                                seatPrice = economyPrice; 
                            }

                            audience[row][column] = 0;
                            bookedSeats--;
                            availableSeats++;
                            earnings -= seatPrice;
                            System.out.println("Booking successfully cancelled. Refunded: $" + seatPrice);
                        } else {
                            System.out.println("Seat is not booked. Nothing to cancel.");
                        }
                    } else {
                        System.out.println("Invalid seat location. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}