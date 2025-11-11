import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int minValueOfMax = Integer.MAX_VALUE;
        int seed = a;

        // Iterate through all seed values a to b inclusive
        for (int i = a; i <= b; i++) {
            Random random = new Random(i);

            // Iterate through all n pseudorandom values and get max
            int maxInArray = 0;
            for (int j = 0; j < n; j++) {
                maxInArray = max(maxInArray, random.nextInt(k));
            }

            // Check if maxInArray is lower than minValueOfMax and update seed
            if (maxInArray < minValueOfMax) {
                minValueOfMax = maxInArray;
                seed = i;
            }
        }

        // Print seed and its max
        System.out.println(seed);
        System.out.println(minValueOfMax);
    }
}