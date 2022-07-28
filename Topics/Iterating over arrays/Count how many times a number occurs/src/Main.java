import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 0;
        int n = scanner.nextInt();
        for (int number : numbers) {
            if (number == n) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}