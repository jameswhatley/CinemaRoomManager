import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0) {
                numbers.add(num);
            }
        }
        System.out.println(Collections.max(numbers));
    }
}
