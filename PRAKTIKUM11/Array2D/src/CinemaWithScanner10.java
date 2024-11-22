import java.util.Scanner;

public class CinemaWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        int choice;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();
                        System.out.print("Enter row number: ");
                        row = sc.nextInt();
                        System.out.print("Enter column number: ");
                        column = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println("Invalid row or column number. Please try again.");
                        } else if (audience[row - 1][column - 1] != null) {
                            System.out.println("Seat is already taken. Please choose another seat.");
                        } else {
                            audience[row - 1][column - 1] = name;
                            continue;
                        }

                        System.out.print("Are there any others to be added? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Audience List:");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            String occupant = (audience[i][j] == null) ? "***" : audience[i][j];
                            System.out.println("Row " + (i + 1) + " Column " + (j + 1) + ": " + occupant);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    sc.close();
            }
        }
    }
}
