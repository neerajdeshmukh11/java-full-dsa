public class NQueensAll {
    public static boolean IsSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonally left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonally right up
        for (int i = row - 1, j = col + 1; i >= 0 && j <board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        

        // base case
        if (row == board.length) {
            PrintBoard(board);
            count++;
            return;
        }

        // jis bhi row par mai hu waha se col pe jate rahunga and queen ko bathate
        // rahunga
        // column loop

        for (int j = 0; j < board.length; j++) {
            if(IsSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row + 1); // recursion call
                board[row][j] = 'x'; // backtracking step
            }
            
        }
    }

    public static void PrintBoard(char board[][]) {
        System.out.println("------chess board------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 10;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        System.out.println("total ways = "+count);
    }
}
