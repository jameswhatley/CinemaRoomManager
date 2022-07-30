import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        //Rotate the given array by n times toward right
        for (int i = 0; i < 1; i++) {
            int j, last;
            //Stores the last element of array
            last = a[a.length - 1];

            for (j = a.length - 1; j > 0; j--) {
                //Shift element of array by one
                a[j] = a[j - 1];
            }
            //Last element of array will be added to the start of array.
            a[0] = last;
        }

        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}