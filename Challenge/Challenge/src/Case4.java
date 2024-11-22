public class Case4 {
    public static void main(String[] args) {
        char letter = 'A'; 

        for (int i = 1; i <= 5; i++) { 
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(letter++ + " "); 
            }
            System.out.println(); 
        }
    }
}
