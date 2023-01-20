import java.util.Random;
import java.util.Scanner;

public class ExampleGameMine {
  public static void main(String[] args) {
    // Initialize constants
    final int ROWS = 10;
    final int COLS = 10;
    final int MINES = 10;

    // Initialize game variables
    boolean[][] mines = new boolean[ROWS][COLS];
    boolean[][] revealed = new boolean[ROWS][COLS];
    int[][] counts = new int[ROWS][COLS];

    // Initialize scanner
    Scanner scanner = new Scanner(System.in);

    // Place mines randomly
    Random random = new Random();
    int placedMines = 0;
    while (placedMines < MINES) {
      int row = random.nextInt(ROWS);
      int col = random.nextInt(COLS);
      if (!mines[row][col]) {
        mines[row][col] = true;
        placedMines++;
      }
    }

    // Calculate counts
    for (int row = 0; row < ROWS; row++) {
      for (int col = 0; col < COLS; col++) {
        if (mines[row][col]) {
          counts[row][col] = -1;
          for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
              if (r >= 0 && r < ROWS && c >= 0 && c < COLS && !mines[r][c]) {
                counts[r][c]++;
              }
            }
          }
        }
      }
    }

    // Play game
    boolean gameOver = false;
    while (!gameOver) {
      // Print board
      for (int row = 0; row < ROWS; row++) {
        for (int col = 0; col < COLS; col++) {
          if (revealed[row][col]) {
            if (mines[row][col]) {
              System.out.print("X ");
            } else {
              System.out.print(counts[row][col] + " ");
            }
          } else {
            System.out.print("* ");
          }
        }
        System.out.println();
      }

      // Get input
      System.out.print("Enter row and column (e.g. 3 4): ");
      int row = scanner.nextInt();
      int col = scanner.nextInt();

      // Check if game is over
      if (mines[row][col]) {
        gameOver = true;
        System.out.println("You hit a mine! Game over.");
      } else {
        revealed[row][col] = true;
      }
    }
  }
}

