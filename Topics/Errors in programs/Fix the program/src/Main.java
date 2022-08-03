import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next(); 
        String b = scanner.next();
        String d = scanner.next();

        String result = a + b + d;

        System.out.println(result);
    }
}