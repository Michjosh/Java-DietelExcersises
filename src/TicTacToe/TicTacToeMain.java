/*
(Tic-Tac-Toe) Create a class TicTacToe that will enable you to write a program to play TicTac-Toe.
The class contains a private 3-by-3 two-dimensional array. Use an enum type to represent
the value in each cell of the array. The enum’s constants should be named X, O and EMPTY
(for a position that does not contain an X or an O). The constructor should initialize the board elements to
EMPTY. Allow two human players. Wherever the first player moves, place an X in the specified square,
and place an O wherever the second player moves. Each move must be to an empty square. After
each move, determine whether the game has been won and whether it’s a draw.
 */
package TicTacToe;

import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        playGame();
        }

    public static void playGame () {
        Scanner scanner = new Scanner(System.in);
        TicTac game = new TicTac();
        boolean player1Turn = true;
        while (!game.isDraw() && !game.checkWin(TicTac.Cell.X) && !game.checkWin(TicTac.Cell.O)) {
            game.printBoard();
            System.out.println();
            TicTac.Cell player = player1Turn ? TicTac.Cell.X : TicTac.Cell.O;
            int row, col;
            try {
                do {
                    System.out.print("Player " + (player1Turn ? "1" : "2") + ", enter row (0-2): ");
                    row = scanner.nextInt();
                    System.out.print("Player " + (player1Turn ? "1" : "2") + ", enter column (0-2): ");
                    col = scanner.nextInt();
                } while (!game.makeMove(row, col, player));
                player1Turn = !player1Turn;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("kindly enter a number between 0-2");
                playGame();
            }
        }
        game.printBoard();
        if (game.checkWin(TicTac.Cell.X)) {
            System.out.println("Player 1 wins!");
        } else if (game.checkWin(TicTac.Cell.O)) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }

    }

}

