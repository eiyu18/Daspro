import java.util.Scanner;

public class DoWhileLeaveEntitlement10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input the number of leave entitlement: ");
        leaveEntitlement = input.nextInt();

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You don't have enough leave entitlement");
                }
            } else if (confirmation.equalsIgnoreCase("n")) {
                System.out.println("No leave taken.");
            } else {
                System.out.println("Program terminated.");
                break; 
            }

        } while (leaveEntitlement > 0);

        input.close();
    }
}
