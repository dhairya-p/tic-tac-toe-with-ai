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
4.  **Start the game:**

   
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
