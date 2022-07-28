import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        int sum1 = sideA + sideB;
        int sum2 = sideA + sideC;
        int sum3 = sideB + sideC;


        if (sum1 > sideC && sum2 > sideB && sum3 > sideA) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}