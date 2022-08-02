import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int currentMax = a;
        int orderNum = 1;

        if (currentMax < b) {
            currentMax = b;
            orderNum = 2;
        }
        if (currentMax < c) {
            currentMax = c;
            orderNum = 3;
        }

        return orderNum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}