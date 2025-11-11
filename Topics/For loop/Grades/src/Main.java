import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int a = 0, b = 0, c = 0, d = 0;
        for (int i=0; i < len; i++) {
            char grade = scanner.next().charAt(0);
            a += grade == 'A' ? 1 : 0;
            b += grade == 'B' ? 1 : 0;
            c += grade == 'C' ? 1 : 0;
            d += grade == 'D' ? 1 : 0;
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}