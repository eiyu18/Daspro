import java.util.Scanner;

public class BankSystem10 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int option; //declare variable for choises
        int mistake = 0; //declare variable for count mistakes
        double balance, withdraw, deposit; //declare variable for balance, withdraw amount, deposit amount
        boolean isRunning = true; //declare variable for checking the program is running or not

        System.out.print("Enter your initial balance: ");
        balance = sc.nextDouble();

        System.out.println("Welcome! Your current balance is $" + balance);

        while (isRunning) {
            System.out.println("Choose an option:"); //list of option the user can choose
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
            option = sc.nextInt();

            switch (option) {
                case 1: //if the user choose 1 as an input
                    System.out.print("Enter amount to deposit: "); //place for the user to input how many amount to deposit
                    deposit = sc.nextDouble();
                    if (deposit >0) { //if the depsit amount is higher than 0, the program will print the deposit is succes
                        balance += deposit;
                        System.out.println("Deposit succesfull! Your new balancee is $" + balance);
                        System.out.println(); //to give blank space
                    } else {

                    }
                    break; // to terminate the loop in between it's processing

                case 2: //if the user choose 2 as an input
                    System.out.println("Enter amount to withdraw: "); //place for the user to input how many amount to withdraw
                    withdraw = sc.nextDouble();
                    if (withdraw > 500) { //if the user input more than $500, the program will print error massage (+1 mistake)
                        System.out.println("Error : cannot withdraw more than $500 in a single transaction.");
                        mistake++;
                    } else if (withdraw > balance) { // if the user withdraw are higher than the balance, the program will print error massage (+1 mistake)
                        System.out.println("Error : incufficient balance. Transaction denied");
                        mistake++;
                    } else if (withdraw <= 0) {  //if user withdraw are lower than $0, the program will print an error massage (+1 mistake)
                        System.out.println("Error : withdrawal amount must be greater than $500 at once");
                        mistake++;
                    } else {
                        balance -= withdraw; //if the user input a valid withdrawal, let the user know the withdrawal is process succesfull 
                        System.out.println("Withdrawal succesfull! Your new balance is $" + balance);
                    }
                    break;
                case 3: //if the user choose 3 as an input
                    System.out.println("Your current balance is $" + balance); //to print the user currnt balance
                    System.out.println();
                    break;
                case 4: //if the user choose 4 as an input 
                    System.out.println("See you next time! Your final balance is $" + balance + "!");
                    isRunning = false; //set the isRunning variable to false to close the program
                    break;
            }
            if (mistake >= 3) { //if there was 3 mistakes the program will closed/the user account is locked for security reason
                System.out.println("Too many invalid attemps. Your account has been temporarily locked for security resons.");
                isRunning = false; 
            }
        }
        sc.close();
    }
}
