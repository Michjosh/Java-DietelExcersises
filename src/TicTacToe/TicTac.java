package TicTacToe;

public class TicTac {

    enum Cell {X, O, EMPTY}
    private Cell[][] board;
    private int movesLeft;

    public TicTac() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
        movesLeft = 9;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }


    public boolean makeMove(int row, int col, Cell player) {
        if (board[row][col] != Cell.EMPTY) {
            return false;
        }
        board[row][col] = player;
        movesLeft--;
        return true;
    }

    public boolean isDraw() {
        return movesLeft == 0;
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
        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}
