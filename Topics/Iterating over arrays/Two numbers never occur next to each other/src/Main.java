import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        //initialize array
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Loop through the array to check if two numbers occur next to each other
        for (int i=0; i<n-1; i++) {
            if (arr[i] == a && arr[i+1] == b || arr[i] == b && arr[i+1] == a) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}