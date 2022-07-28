import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num != 0) {
                sum += num;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}