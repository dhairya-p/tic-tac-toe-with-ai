import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int height = scanner.nextInt();
        int noOfBridges = scanner.nextInt();
        for (int i = 1; i <= noOfBridges; i++) {
            if (scanner.nextInt() <= height) {
                System.out.println("Will crash on bridge " + i);
                return;
            }
        }
        System.out.println("Will not crash");
    }
}