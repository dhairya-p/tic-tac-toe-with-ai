package tictactoe;

public class Game {

    private final String X_player;
    private final String O_player;

    public Game(String X_player, String O_player) {
        this.X_player = X_player;
        this.O_player = O_player;
    }

    /**
     * Starts the Tic-Tac-Toe game between two players.
     * Initializes the game board and players based on their types.
     * The game continues until there is a result (win or draw).
     * At each turn, players make a move and the board is printed.
     * The result of the game is printed at the end.
     */
    public void startGame() {
        // initialise empty cells initialisation array
        char[][] cells = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = ' ';
            }
        }

        // initialise board
        Board board = new Board(cells);

        // initialise players
        Player playerX = switch (X_player) {
            case "user" -> new User('X');
            case "easy" -> new EasyComputer('X');
            case "medium" -> new MediumComputer('X');
            case "hard" -> new HardComputer('X');
            default -> new EasyComputer('X');
        };

        Player playerO = switch (O_player) {
            case "user" -> new User('O');
            case "easy" -> new EasyComputer('O');
            case "medium" -> new MediumComputer('O');
            case "hard" -> new HardComputer('O');
            default -> new EasyComputer('O');
        };

        // Game start
        board.printBoard();

        // Game loop
        while (Result.getResult(board).equals("Game not finished")) {
            playerX.getMove(board);
            board.printBoard();

            if (!Result.getResult(board).equals("Game not finished")) {
                break;
            }

            playerO.getMove(board);
            board.printBoard();
        }
        System.out.println(Result.getResult(board) + "\n");
    }
}
