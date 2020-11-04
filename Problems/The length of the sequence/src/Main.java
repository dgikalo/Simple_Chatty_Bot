import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;
        boolean isStop = false;

        while (!isStop) {
            number = scanner.nextInt();

            if (number == 0) {
                isStop = true;
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}