package tictactoe;

public class HardComputer implements Player {
    private final char symbol;

    // Constructor
    public HardComputer(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Make a move as hard level AI.
     *
     * Use minimax algorithm to find the optimal move.
     *
     * @param board The current state of the board.
     */
    @Override
    public void getMove(Board board) {
        // minimax algorithm
        int[] move = Minimax.getBestMove(board, symbol);
        board.setCells(move[0], move[1], symbol);
        System.out.println("Making move level \"hard\"");
    }
}
