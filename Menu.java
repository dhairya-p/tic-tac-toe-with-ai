package tictactoe;

import java.util.Scanner;

public class Menu {
    /**
     * Runs the main loop of the program. This loop will keep running until the user types "exit".
     * The loop will take user input commands and validate them. If the command is "exit", the loop
     * will break and the program will end. If the command is "start", the program will create a Game
     * object and start the game. If the command is invalid, the program will print "Bad parameters!"
     * to the console.
     *
     * @param args the command line arguments to this program. Not used.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Take user input command
            System.out.print("Input command: ");
            String[] commands = scanner.nextLine().split("\\s+");

            // Validate user input command
            if (commands.length == 1 && commands[0].equals("exit")) {
                break; // Exit the loop and end the program
            } else if (commands.length == 3 && commands[0].equals("start")) {
                if (isValidPlayer(commands[1]) && isValidPlayer(commands[2])) {
                    Game game = new Game(commands[1], commands[2]);
                    game.startGame();
                } else {
                    System.out.println("Bad parameters!");
                }
            } else {
                System.out.println("Bad parameters!");
            }
        }

        scanner.close();
    }

    /**
     * Helper method to validate player types.
     * @param playerType The player type string to validate.
     * @return true if the playerType is "user" or "easy", false otherwise.
     */
    private static boolean isValidPlayer(String playerType) {
        return playerType.equals("user") || playerType.equals("easy") || playerType.equals("medium") || playerType.equals("hard");
    }
}