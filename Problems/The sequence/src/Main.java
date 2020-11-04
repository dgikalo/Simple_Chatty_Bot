import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        int number;
        int max = 0;

        while (0 < quantity) {
            number = scanner.nextInt();

            if (number % 4 == 0 && max < number) {
                max = number;
            }
            quantity--;
        }

        System.out.println(max);
    }
}