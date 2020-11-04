import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridgesQuantity = scanner.nextInt();
        int height;
        boolean willCrash = false;
        ArrayList<Integer> bridgesHeight = new ArrayList<>();

        while (bridgesQuantity > 0) {
            height = scanner.nextInt();
            bridgesHeight.add(height);
            bridgesQuantity--;
        }

        for (int eachHeight : bridgesHeight) {
            if (eachHeight <= busHeight) {
                System.out.println("Will crash on bridge " + (bridgesHeight.indexOf(eachHeight) + 1));
                willCrash = true;
                break;
            }
        }
        if (!willCrash) {
            System.out.println("Will not crash");
        }
    }
}