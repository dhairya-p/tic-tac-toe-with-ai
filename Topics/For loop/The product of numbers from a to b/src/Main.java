import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b =  scanner.nextInt();
        int pdt = 1;
        for (int i = a; i < b ; i++) {
            pdt *= i;
        }
        System.out.println(pdt);
    }
}
