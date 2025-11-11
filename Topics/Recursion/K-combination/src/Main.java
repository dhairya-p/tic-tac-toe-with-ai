import java.util.Scanner;

public class Main {

    public static int comb(int n, int k) {
        if (n < k) return 0;

        // Base case
        if (n == k || k == 0) {
            return 1;
        }

        // Recursive case
        return comb(n - 1, k - 1) + comb(n - 1, k);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        System.out.println(comb(n, k));
    }
}