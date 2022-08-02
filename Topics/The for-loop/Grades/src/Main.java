import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        int numOfGrades = scanner.nextInt();

        for (int i = 0; i < numOfGrades; i++) {
            String grade = scanner.next();
            if ("a".equalsIgnoreCase(grade)) {
                aCount++;
            } else if ("b".equalsIgnoreCase(grade)) {
                bCount++;
            } else if ("c".equalsIgnoreCase(grade)) {
                cCount++;
            } else if ("d".equalsIgnoreCase(grade)) {
                dCount++;
            }
        }
        System.out.printf("%s %s %s %s", dCount, cCount, bCount, aCount);
    }
}
