import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}