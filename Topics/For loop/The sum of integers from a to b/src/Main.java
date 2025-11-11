import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i =  scanner.nextInt();
        int j = scanner.nextInt();
        int sum = 0;
        for (; i <= j; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
