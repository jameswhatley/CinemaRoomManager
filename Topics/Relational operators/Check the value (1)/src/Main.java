import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        final int topNum = 10;
        System.out.println(num < topNum);
    }
}