import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> bridgeHeights = new ArrayList<>();

        int busHeight = scanner.nextInt();

        int bridgeCount = scanner.nextInt();

        for (int i = 0; i < bridgeCount; i++) {
            int bridgeHeight = scanner.nextInt();
            bridgeHeights.add(bridgeHeight);
        }

        int count = 0;
        boolean willCrash = false;
        for (int bridgeHeight : bridgeHeights) {
            count++;
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + count);
                willCrash = true;
                break;
            }
        }
        if (!willCrash) {
            System.out.println("Will not crash");
        }

    }
}