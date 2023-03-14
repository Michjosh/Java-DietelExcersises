package TicTacToe;
import java.util.Random;
public class TicTacToeWithComputer {
        enum Cell { X, O, EMPTY }
        private Cell[][] board;

        public TicTacToeWithComputer() {
            board = new Cell[3][3];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j] = Cell.EMPTY;
                }
            }
        }

        public boolean makeMove(int row, int col, Cell player) {
            if (board[row][col] == Cell.EMPTY) {
                board[row][col] = player;
                return true;
            } else {
                return false;
            }
        }

        public boolean checkWin(Cell player) {
            // Check rows
            for (Cell[] cells : board) {
                if (cells[0] == player && cells[1] == player && cells[2] == player) {
                    return true;
                }
            }

            // Check columns
            for (int j = 0; j < board[0].length; j++) {
                if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                    return true;
                }
            }

            // Check diagonals
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return true;
            }
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return true;
            }

            return false;
        }

        public boolean isDraw() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == Cell.EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

        public void printBoard() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void computerMove() {
            Random random = new Random();
            int row, col;
            do {
                row = random.nextInt(3);
                col = random.nextInt(3);
            } while (!makeMove(row, col, Cell.O));
        }

}
