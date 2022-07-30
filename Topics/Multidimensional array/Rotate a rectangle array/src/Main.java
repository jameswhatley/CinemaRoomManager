import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get size of array
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        //Create array grid
        int[][] array = new int[rows][columns];

        //Populate the array with user input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        //Rotate by 90 degrees
        for (int i = 0; i < columns; i++) {
            for (int j = rows - 1; j >= 0; j--) {
                //j is in descending order, i is the second because it changes less frequently
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}