package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int higherCost = 10;
        int lowerCost = 8;

        //Create initial Seat grid
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of seats in each row: ");
        int seats = scanner.nextInt();
        char[][] seatGrid = new char[rows][seats];

        //Print Cinema Grid
        System.out.println("Cinema:");
        printCinema(rows, seats);

        //Select seat
        System.out.print("Enter a row number: ");
        int rowNum = scanner.nextInt();
        System.out.print("Enter a seat number in that row: ");
        int seatNum = scanner.nextInt();

        //Calculate Ticket Price from selected seat
        int numberOfSeats = rows * seats;
        if (numberOfSeats <= 60) {
            System.out.println("\nTicket price: $" + higherCost);
        } else if (rowNum <= rows / 2) {
            System.out.println("\nTicket price: $" + higherCost);
        } else {
            System.out.println("\nTicket price: $" + lowerCost);
        }

        //Print Seat Grid with booked seat
        System.out.println("\nCinema:");
        System.out.print("  ");
        for (int i = 0; i < seats; i++){
            System.out.printf("%d ", i + 1);
        }
        System.out.println();

        for ( int i = 0; i < seatGrid.length; i++){
            System.out.printf("%d ", i + 1);
            for ( int j = 0; j < seatGrid[i].length; j++){
                seatGrid[i][j] = 'S';
                seatGrid[rowNum-1][seatNum-1] = 'B';
                System.out.print(seatGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getProfit(int rows, int seats, int numberOfSeats, int higherCost, int lowerCost) {
        int totalProfit;
        if (numberOfSeats > 60) {
            int incomeOfForwardSeats = (rows / 2) * seats * higherCost;
            int incomeOfBackSeats = (rows - (rows / 2)) * seats * lowerCost;
            totalProfit = incomeOfForwardSeats + incomeOfBackSeats;
        } else {
            totalProfit = numberOfSeats * higherCost;
        }
        System.out.print("Total Income: $" + totalProfit);
    }

    public static void printCinema(int rows, int columns) {
        System.out.print("  ");             // print the column labels
        for (int j = 0; j < columns; j++) {
            System.out.print(" " + (j + 1));
        }
        System.out.println(" ");
        for (int i = 0; i < rows; i++) {
            System.out.print(" " + (i + 1));   // print the row number
            for (int j = 0; j < columns; j++) {
                System.out.print(" " + "S"); // print the seat number
            }
            System.out.println();
        }
    }

}