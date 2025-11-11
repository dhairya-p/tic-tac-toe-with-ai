package tictactoe;

import java.util.Random;

public class MediumComputer implements Player {
    private final char symbol;
    private final Random random = new Random(); // Create it once here


    public MediumComputer(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Make a move as medium level AI.
     * If there is a winning move, take it. Otherwise, if there is a blocking move, take it.
     * If neither, fall back to a random move.
     *
     * @param board The current state of the board.
     */
    @Override
    public void getMove(Board board) {
        // Check if there is a winning or blocking move
        int[] move = board.getWinningOrBlockingMove(symbol) == null  // check winning
                ? board.getWinningOrBlockingMove(symbol == 'X' ? 'O' : 'X') // check blocking
                : board.getWinningOrBlockingMove(symbol);

        if (move != null) {
            board.setCells(move[0], move[1], symbol);
            System.out.println("Making move level \"medium\"");
        } else {
            getRandomMove(board);
        }
    }

    /**
     * Make a random move on the board.
     * This method is used as a fallback when there are no winning or blocking moves.
     * It selects a random unoccupied cell on the board and places the symbol there.
     *
     * @param board The current state of the board.
     */
    // Fallback move - random
    public void getRandomMove(Board board) {
        while (true) {
            // Get random cell
            int row = random.nextInt(3);
            int col = random.nextInt(3);

            char[][] cells = board.getCells();

            // Check if cell is already occupied
            if (cells[row][col] != ' ') {
                continue;
            }
            System.out.println("Making move level \"medium\"");
            board.setCells(row, col, symbol);
            break;
        }
    }
}
