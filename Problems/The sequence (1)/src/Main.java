import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        int counter = quantity;

        for (int i = 0; i <= quantity; i++) {
            for (int j = 0; j < i; j++) {
                if (counter > 0) {
                    System.out.print(i + " ");
                    counter--;
                }
            }
        }
    }
}