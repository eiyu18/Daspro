import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int base, height;
        float area;
        int init_sav_amount, sav_period;
        double final_sav_amount, interest, interest_percent = 0.02;
        System.out.println("Input your inital saving amount");
        init_sav_amount = sc.nextInt();
        System.out.println("Input your initial saving period: ");
        sav_period = sc.nextInt();
        interest = sav_period * interest_percent * init_sav_amount;
        final_sav_amount = interest + init_sav_amount;
        System.out.println("Interest: "+ interest);
        System.out.println("Final saving amount: "+ final_sav_amount);
    }
}
