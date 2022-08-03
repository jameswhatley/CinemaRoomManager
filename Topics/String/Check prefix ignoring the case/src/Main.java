import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String first = String.valueOf(input.charAt(0));
        if ("J".equalsIgnoreCase(first)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}