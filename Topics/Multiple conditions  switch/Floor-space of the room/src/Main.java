import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.nextLine();

        switch (shape) {
            case "rectangle":
                System.out.println((double)scanner.nextInt() * scanner.nextInt());
                break;
            case "circle":
                int radius = scanner.nextInt();
                System.out.println(3.14 * radius * radius);
                break;
            case "triangle":
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                double s = (double)(a + b + c) / 2;
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            default:
                break;
        }
    }
}