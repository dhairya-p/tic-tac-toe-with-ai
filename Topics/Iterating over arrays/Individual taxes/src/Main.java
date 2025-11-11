import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] incomes = new int[len];
        int[] taxPercents = new int[len];

        // Initialize arrays
        for (int i = 0; i < len; i++) {
            incomes[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            taxPercents[i] = sc.nextInt();
        }

        // Update max tax
        double maxTax = -1.0; int maxTaxIndex = 0;
        for (int i = 0; i < len; i++) {
            double currentTax = (double) incomes[i] * taxPercents[i] / 100.0;
            if (currentTax > maxTax) {
                maxTax = currentTax;
                maxTaxIndex = i;
            }
        }

        System.out.println(maxTaxIndex+1);
        sc.close();

    }
}