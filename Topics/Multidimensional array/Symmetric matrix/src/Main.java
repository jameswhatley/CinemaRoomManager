import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = scanner.nextInt();
            }
        }

        boolean isSymmetric  = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (!isSymmetric) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}