package tictactoe;

public class Board {

    private char[][] cells;

    public Board(char[][] cells) {
        this.cells = cells;
    }

    public char[][] getCells() {
        return cells;
    }

    public void setCells(int row, int col, char symbol) {
        this.cells[row][col] = symbol;
    }


    /**
     * Prints the current state of the board to the console.
     */
    public void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(this.cells[i][j] + (j < 2 ? " " : ""));
            }
            System.out.println(" |");
        }
        System.out.println("---------");
    }

    /**
     * Returns true if the board is full, false otherwise.
     *
     * @return true if the board is full, false otherwise
     */
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.cells[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Returns the position of a move that can lead to a win or block an opponent's win.
     * It checks for any two consecutive symbols in a row, column, or diagonal
     * and returns the empty cell in that line for the given symbol.
     *
     * @param symbol the player's symbol to check for potential winning or blocking move
     * @return an array containing the row and column of the move, or null if no such move exists
     */
    public int[] getWinningOrBlockingMove(char symbol) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (cells[i][0] == ' ' && cells[i][1] == cells[i][2] && cells[i][2] == symbol) {
                return new int[]{i, 0};
            } else if (cells[i][1] == ' ' && cells[i][0] == cells[i][2] && cells[i][2] == symbol) {
                return new int[]{i, 1};
            } else if (cells[i][2] == ' ' && cells[i][0] == cells[i][1] && cells[i][1] == symbol) {
                return new int[]{i, 2};
            }

            // Check columns
            if (cells[0][i] == ' ' && cells[1][i] == cells[2][i] && cells[2][i] == symbol) {
                return new int[]{0, i};
            } else if (cells[1][i] == ' ' && cells[0][i] == cells[2][i] && cells[2][i] == symbol) {
                return new int[]{1, i};
            } else if (cells[2][i] == ' ' && cells[0][i] == cells[1][i] && cells[1][i] == symbol) {
                return new int[]{2, i};
            }
        }

        // Check diagonals
        if (cells[0][0] == ' ' && cells[1][1] == cells[2][2] && cells[2][2] == symbol) {
            return new int[]{0, 0};
        } else if (cells[1][1] == ' ' && cells[0][0] == cells[2][2] && cells[2][2] == symbol) {
            return new int[]{1, 1};
        } else if (cells[2][2] == ' ' && cells[0][0] == cells[1][1] && cells[1][1] == symbol) {
            return new int[]{2, 2};
        } else if (cells[0][2] == ' ' && cells[1][1] == cells[2][0] && cells[2][0] == symbol) {
            return new int[]{0, 2};
        } else if (cells[1][1] == ' ' && cells[0][2] == cells[2][0] && cells[2][0] == symbol) {
            return new int[]{1, 1};
        } else if (cells[2][0] == ' ' && cells[0][2] == cells[1][1] && cells[1][1] == symbol) {
            return new int[]{2, 0};
        }
        return null;
    }
}

