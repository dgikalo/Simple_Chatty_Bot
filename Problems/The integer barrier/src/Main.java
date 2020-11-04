import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        while (true) {
            int number = scanner.nextInt();
            result += number;

            if (number == 0) {
                break;
            } else if (1000 <= result) {
                result -= 1000;
                break;
            }
        }
        System.out.println(result);
    }
}