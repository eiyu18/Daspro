import java.util.Scanner;

public class Inventory10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] items = {"Apples", "Banana", "cherries", "Dates", "Eggplant"};
        int[] quantities = {50, 30, 40, 60, 20};
        boolean running = true;
        int index, action, quantityToAdd, quantityToRemove;

        while (true) {
            System.out.println("Current inventory:");
            for (int i = 0; i < items.length; i++) {
                System.out.println(i + ": " + items[i] + ": " + quantities[i]);
            }

            System.out.print("Enter the index of the item to manage (0-4, or 99 to exit): ");
            index = sc.nextInt();

            if (index == 99) {
                running = false;
                break;
            } else if (index < 0 || index >= items.length) {
                System.out.println("Invalid selection. Try again.");
                continue;
            }

            System.out.println("Selected item: " + items[index]);

            System.out.print("Enter action (1: Add Stock, 2: Remove Stock): ");
            action = sc.nextInt();

            switch (action) {
                case 1: 
                    System.out.print("Enter quantity: ");
                    quantityToAdd = sc.nextInt();
                    quantities[index] += quantityToAdd;
                    System.out.println("Stock added successfully.");
                    break;

                case 2: 
                    System.out.print("Enter quantity: ");
                    quantityToRemove = sc.nextInt();
                    if (quantityToRemove > quantities[index]) {
                        System.out.println("Not enough stock to remove.");
                    } else {
                        quantities[index] -= quantityToRemove;
                        System.out.println("Stock removed successfully.");
                    }
                    break;

                default:
                    System.out.println("Invalid index. Try again.");
                    break;
            }
        }

        sc.close();
        System.out.println("Program terminated!");

    }
}
