import java.util.Scanner;

public class TicTacToe10 {
    public static void main(String[] args) {
        char[][] board = {
            { '-', '-', '-' },
            { '-', '-', '-' },
            { '-', '-', '-' }
        };

        boolean isPlayerX = true;
        boolean hasWinner = false;
        boolean isDraw = false;
        Scanner sc = new Scanner(System.in);

        while ( !hasWinner && !isDraw) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println((isPlayerX ? "Playerx" : "Player O") + ", enter row (0, 1, or 2): ");
            int row = sc.nextInt();
            System.out.println("Enter column (0, 1 or 2): ");
            int col = sc.nextInt();
            
            if (board[row][col] == '-') {
                board[row][col] = isPlayerX ? 'X' : 'O';
                isPlayerX = !isPlayerX;
            } else {
                System.out.println("Cell already taken! Try again.");
                continue;
            }
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board [i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                    hasWinner = true;
                }
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                    hasWinner = true;
                }
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
                hasWinner = true;
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
                hasWinner = true;
            }
            isDraw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        isDraw = false;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            if (hasWinner) {
                System.out.println((isPlayerX ? "Player O" : "Player X") + " is the winner!");
            } else if (isDraw) {
                System.out.println("It's a draw!");
            }
        }
    }    
}
