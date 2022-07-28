import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();

        if (num1.charAt(0) == num1.charAt(3) && num1.charAt(1) == num1.charAt(2)) {
            System.out.println("1");
        } else {
            System.out.println("34");
        }

    }
}