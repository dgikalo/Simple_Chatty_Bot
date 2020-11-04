import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> originalList = new ArrayList<>();
        int number;
        boolean isOrdered = false;

        while (scanner.hasNextInt()) {
            number = scanner.nextInt();

            if (number != 0) {
                originalList.add(number);
            }
        }

        ArrayList<Integer> sortedList = new ArrayList<>(originalList);
        ArrayList<Integer> reversedList = new ArrayList<>(originalList);

        Collections.sort(sortedList);
        Collections.reverse(reversedList);

        if (originalList.equals(sortedList) | sortedList.equals(reversedList)) {
            isOrdered = true;
        }
        System.out.println(isOrdered);
    }
}