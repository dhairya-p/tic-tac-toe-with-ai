package tictactoe;

public interface Player {
    /**
     * This method is called when it's the player's turn to make a move.
     * The implementation will differ depending on whether the player is a user or a computer.
     * @param board The current game board, represented as a char array.
     */
    public void getMove(Board board);
}