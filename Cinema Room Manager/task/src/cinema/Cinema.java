package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int higherCost = 10;
        int lowerCost = 8;
        int totalProfit = 0;

        System.out.println("Cinema:\n" +
                "  1 2 3 4 5 6 7 8\n" +
                "1 S S S S S S S S\n" +
                "2 S S S S S S S S\n" +
                "3 S S S S S S S S\n" +
                "4 S S S S S S S S\n" +
                "5 S S S S S S S S\n" +
                "6 S S S S S S S S\n" +
                "7 S S S S S S S S");

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of seats in each row: ");
        int seats = scanner.nextInt();

        int numberOfSeats = rows * seats;

        if (numberOfSeats > 60) {
            int incomeOfForwardSeats = (rows / 2) * seats * higherCost;
            int incomeOfBackSeats = (rows - (rows / 2)) * seats * lowerCost;
            totalProfit = incomeOfForwardSeats + incomeOfBackSeats;
        } else {
            totalProfit = numberOfSeats * higherCost;
        }
        System.out.print("Total Income: $" + totalProfit);
    }
}