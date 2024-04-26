public class NQueen {

    public static void printBoard(char board[][]) {
        System.out.println("-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // check the safety
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int rowIndex = row - 1; rowIndex >= 0; rowIndex--) {
            if (board[rowIndex][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int rowIndex = row - 1, columnIndex = col - 1; rowIndex >= 0
                && columnIndex >= 0; rowIndex--, columnIndex--) {
            if (board[rowIndex][columnIndex] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int rowIndex = row - 1, columnIndex = col + 1; rowIndex >= 0
                && columnIndex < board.length; rowIndex--, columnIndex++) {
            if (board[rowIndex][columnIndex] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueen(char board[][], int row) {

        // base
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueen(board, 0);

    }

}
