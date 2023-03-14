package TicTacToe;

import java.util.Scanner;

public class TicTacWithComputerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToeWithComputer game = new TicTacToeWithComputer();

        System.out.print("Do you want to go first? (y/n): ");
        boolean player1Turn = scanner.next().equalsIgnoreCase("y");

        while (!game.isDraw() && !game.checkWin(TicTacToeWithComputer.Cell.X) && !game.checkWin(TicTacToeWithComputer.Cell.O)) {
            if (player1Turn) {
                game.printBoard();
                int row, col;
                do {
                    System.out.print("Enter row (0-2): ");
                    row = scanner.nextInt();
                    System.out.print("Enter column (0-2): ");
                    col = scanner.nextInt();
                } while (!game.makeMove(row, col, TicTacToeWithComputer.Cell.X));
            } else {
                game.computerMove();
            }

            player1Turn = !player1Turn;
        }

        game.printBoard();

        if (game.checkWin(TicTacToeWithComputer.Cell.X)) {
            System.out.println("You win!");
        } else if (game.checkWin(TicTacToeWithComputer.Cell.O)) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
