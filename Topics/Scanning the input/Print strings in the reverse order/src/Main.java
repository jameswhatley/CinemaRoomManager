import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String javaKey = scanner.next();
        String programming = scanner.next();
        String language = scanner.next();

        System.out.printf("%s\n%s\n%s", language, programming, javaKey);
    }
}