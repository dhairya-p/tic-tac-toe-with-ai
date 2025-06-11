package tictactoe;

public class Minimax {
    public static int[] getBestMove(Board board, char symbol) {
        char player = symbol;
        char opponent = (symbol == 'X') ? 'O' : 'X';
        int bestVal = -1000; // Start with a very low value
        int[] bestMove = {-1, -1};

        // Evaluate minimax function for all empty cells
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if cell is empty
                if (board.getCells()[i][j] == ' ') {
                    // Make the move
                    board.setCells(i, j, player);

                    // Compute evaluation function for this move.
                    int moveVal = minimax(board, 0, false, player, opponent);

                    // Undo the move
                    board.setCells(i, j, ' ');

                    // If the value of the current move is more than the best value,
                    // then update best
                    if (moveVal > bestVal) {
                        bestMove[0] = i;
                        bestMove[1] = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }


    private static int minimax(Board board, int depth, boolean isMax, char player, char opponent) {
        int score = evaluate(board, player, opponent);

        // If Maximizer or Minimizer has won the game, return the score
        if (score == 10 || score == -10 || board.isFull()) {
            return score;
        }

        // If this is maximizer's move
        if (isMax) {
            int best = -1000;
            // Traverse all cells
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.getCells()[i][j] == ' ') {
                        // Make the move
                        board.setCells(i, j, player);
                        // Call minimax recursively and choose the maximum value
                        best = Math.max(best, minimax(board, depth + 1, !isMax, player, opponent));
                        // Undo the move
                        board.setCells(i, j, ' ');
                    }
                }
            }
            return best;
        }
        // If this is minimizer's move
        else {
            int best = 1000;
            // Traverse all cells
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.getCells()[i][j] == ' ') {
                        // Make the move
                        board.setCells(i, j, opponent);
                        // Call minimax recursively and choose the minimum value
                        best = Math.min(best, minimax(board, depth + 1, !isMax, player, opponent));
                        // Undo the move
                        board.setCells(i, j, ' ');
                    }
                }
            }
            return best;
        }
    }

    private static int evaluate(Board board, char player, char opponent) {
        char[][] cells = board.getCells();
        // Checking for Rows for X or O victory.
        for (int row = 0; row < 3; row++) {
            if (cells[row][0] == cells[row][1] && cells[row][1] == cells[row][2]) {
                if (cells[row][0] == player) return +10;
                else if (cells[row][0] == opponent) return -10;
            }
        }
        // Checking for Columns for X or O victory.
        for (int col = 0; col < 3; col++) {
            if (cells[0][col] == cells[1][col] && cells[1][col] == cells[2][col]) {
                if (cells[0][col] == player) return +10;
                else if (cells[0][col] == opponent) return -10;
            }
        }
        // Checking for Diagonals for X or O victory.
        if (cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]) {
            if (cells[0][0] == player) return +10;
            else if (cells[0][0] == opponent) return -10;
        }
        if (cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0]) {
            if (cells[0][2] == player) return +10;
            else if (cells[0][2] == opponent) return -10;
        }
        // Else if none of them have won then return 0
        return 0;
    }
}
