import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //array length
        int arrayLength = scanner.nextInt();

        //int array
        int[] numbers = new int[arrayLength];

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        for (int number : numbers) {
            if (n < number) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}