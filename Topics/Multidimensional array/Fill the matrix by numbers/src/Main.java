import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[][] grid = new int[size][size];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = Math.abs(j - i);
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}