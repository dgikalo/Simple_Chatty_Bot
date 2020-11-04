import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = 0;

        for (; x <= 1000; x++) {
            if (a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}