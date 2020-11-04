import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; Math.pow(i, 2) <= number; i++) {
            System.out.println((int)Math.pow(i, 2));
        }
    }
}