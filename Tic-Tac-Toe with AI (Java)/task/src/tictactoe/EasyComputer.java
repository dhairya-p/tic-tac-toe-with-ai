package tictactoe;

import java.util.Random;

public class EasyComputer implements Player {
    private final char symbol;

    public EasyComputer(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Make a move as easy level AI.
     *
     * The move is chosen randomly from the available empty cells on the board.
     *
     * @param board The current game board, represented as a 2D char array.
     */
    @Override
    public void getMove(Board board) {
        Random random = new Random();

        char[][] cells = board.getCells();

        while (true) {
            // Get random cell
            int row = random.nextInt(3);
            int col = random.nextInt(3);

            // Check if cell is already occupied
            if (cells[row][col] != ' ') {
                continue;
            }
            System.out.println("Making move level \"easy\"");
            board.setCells(row, col, symbol);
            break;
        }
    }
}
