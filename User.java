package tictactoe;

import java.util.Scanner;


public class User implements Player {
    private final char symbol;

    public User(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Get the move from user input.
     * This method will continuously prompt the user until a valid move is entered.
     * The user is expected to enter two numbers separated by a space,
     * where the first number is the row and the second number is the column.
     * The coordinates are 1-indexed, with the top-left cell being at (1,1).
     * If the entered coordinates are invalid or the cell is already occupied,
     * the user will be asked to enter the coordinates again.
     * @param board the current game board
     */
    @Override
    public void getMove(Board board) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the coordinates: ");
            String line = scanner.nextLine();
            String[] parts = line.split("\\s+"); // Split by one or more whitespace characters

            // Input validation
            if (!parts[0].matches("\\d+") || !parts[1].matches("\\d+")) {
                System.out.println("You should enter numbers!");
                continue;
            }

            // Get coordinates
            int row, col; // 1-based coordinates from user

            try {
                row = Integer.parseInt(parts[0]);
                col = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                continue;
            }

            // Validate range (1-3 for user input)
            if (row < 1 || row > 3 || col < 1 || col > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            // get cell values
            char[][] cells = board.getCells();

            // Convert to 0-indexed for array access
            row -= 1;
            col -= 1;


            // Check if cell is already occupied
            if (cells[row][col] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            board.setCells(row, col, symbol);
            break;
        }
    }
}
