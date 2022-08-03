import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine().trim().replace(" ", "");
        String input2 = scanner.nextLine().trim().replace(" ", "");

        System.out.println(input1.equalsIgnoreCase(input2));
    }
}