import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Set dimensions of 2D array
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Define 2D array
        int[][] arr = new int[r][c];

        // Initialise 2D array with input values
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int col1 = sc.nextInt();
        int col2 = sc.nextInt();
        // Swap columns
        swapColumns(arr, col1, col2);

        // Print 2D array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

     /** Swap two columns of a 2D array.
     *
     * @param arr 2D array to swap columns in
     * @param col1 index of first column to swap
     * @param col2 index of second column to swap
     */
    public static void swapColumns(int[][] arr, int col1, int col2) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][col1];  // save first column value to temp
            arr[i][col1] = arr[i][col2];  // replace first column value with second
            arr[i][col2] = temp; // replace second column value with temp
        }
    }
}