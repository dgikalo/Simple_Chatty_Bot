import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        long result = 1;
        byte count = 0;

        while (result <= number) {
            count++;
            result *= count;
        }

        System.out.println(count);
    }
}