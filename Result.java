package tictactoe;

public class Result {
    /**
     * Get the result of a game of Tic Tac Toe, given as a Board object.
     *
     * @param board Board object representing the current state of the game.
     * @return String indicating the result of the game. Possible values are "X wins", "O wins", "Draw", or "Game not finished".
     */
    public static String getResult(Board board) {
        char[][] cells = board.getCells();
        char winner = ' '; // Default: no winner

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (cells[i][0] != ' ' && cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) {
                winner = cells[i][0]; // Row win
            }
            if (cells[0][i] != ' ' && cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]) {
                winner = cells[0][i]; // Column win
            }
        }

        // Check diagonals
        if (cells[0][0] != ' ' && cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]) {
            winner = cells[0][0];
        }
        if (cells[0][2] != ' ' && cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0]) {
            winner = cells[0][2];
        }

        // Print result
        if (winner == 'X' || winner == 'O') {
            return(winner + " wins");
        } else if (board.isFull()) {
            return "Draw";
        } else {
            return "Game not finished";
        }
    }
}
