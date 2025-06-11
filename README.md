# Tic-Tac-Toe with AI

This is a CLI Tic-Tac-Toe game implemented in Java, featuring a AI opponent that uses the minimax algorithm to play optimally.

---

## 🌟 Features

* **Player vs. AI**: Play against a computer opponent, with 3 levels of difficulty: easy, medium, hard
* **Player vs. Player**: Play against anther human opponent.
  - The "Easy" difficulty level just makes a random move.
  - The "Medium" difficulty level uses some logic to find wining and blocking moves.
  - The "Hard" difficulty level uses the **Minimax algorithm** to make the best possible move every time, making it an unbeatable opponent.

---

## 📂 Code Structure

The project is organized into several classes, each with a specific responsibility:

* `Board.java`: An interface that defines the structure and behavior of the game board. It handles the state of the game's 3x3 grid.
* `Player.java`: An interface representing a player, which can be either a human or a computer.
* `HardComputer.java`: An implementation of the `Player` interface for the "Hard" AI. It uses the `Minimax` class to decide its moves.
* `Minimax.java`: A utility class that contains the core logic for the minimax algorithm. It recursively explores all possible game states to find the optimal move for the AI.
* `Result.java`: A helper class to check the current state of the game and determine if there is a winner, a draw, or if the game is still in progress.

---

## 🚀 How to Run

To compile and run the project from your terminal, follow these steps:

1.  **Navigate to the project's root directory.**

2.  **Compile the Java source files:**
    ```bash
    javac tictactoe/*.java
    ```

3.  **Run the main application:**
    (Assuming you have a `Menu.java` class that contains the main game loop)
    ```bash
    java tictactoe.Menu
    ```
4.  **Run the main application:**

   
     To play as X against Easy AI:
     ```bash
      Input command: start user easy
     ```
    To play as O against Medium AI:
     ```bash
      Input command: start medium user
     ```
    To play 2 Hard AIs against each other (always gives a draw due to optimal play):
     ```bash
      Input command: start hard hard
     ```
    To exit:
     ```bash
      Input command: exit
     ```
