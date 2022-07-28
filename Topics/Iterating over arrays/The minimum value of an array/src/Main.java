import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        //Adds user inputted numbers to array
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        //Sorts array from lowest to highest
        Arrays.sort(numbers);

        //Prints out minimum value
        System.out.println(numbers[0]);
    }
}