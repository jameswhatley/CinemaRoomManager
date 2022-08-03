package cinema;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    static final int higherCost = 10;
    static final int lowerCost = 8;
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");
    static int seatNum;
    static int rowNum;
    static int rows;
    static int seats;
    static int numberOfSeats;
    static int soldTickets = 0;
    static int currentIncome = 0;

    static double percentage = 0;

    public static void main(String[] args) {

        // Create initial Seat grid
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of seats in each row: ");
        seats = scanner.nextInt();

        numberOfSeats = rows * seats;

        char[][] seatGrid = new char[rows][seats];
        setCinemaGrid(seatGrid);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    printCinema(rows, seatGrid);
                    break;
                case 2:
                    buyTicket(rows, seatGrid);
                    break;
                case 3:
                    showStatistics();
                    break;
                case 0:
                    exit = true;
                    break;
            }
        }
    }

    private static void buyTicket(int rows, char[][] seatGrid) {
        try {
            // Select seat
            System.out.print("\nEnter a row number: ");
            rowNum = scanner.nextInt();
            System.out.print("Enter a seat number in that row: ");
            seatNum = scanner.nextInt();

            if (seatGrid[rowNum - 1][seatNum - 1] == 'B') {
                System.out.println("That ticket has already been purchased!\n");
                buyTicket(rows, seatGrid);
            } else {
                // Calculate Ticket Price from selected seat
                if (numberOfSeats <= 60) {
                    System.out.println("\nTicket price: $" + higherCost);
                    currentIncome += higherCost;
                } else if (rowNum <= rows / 2) {
                    System.out.println("\nTicket price: $" + higherCost);
                    currentIncome += higherCost;
                } else {
                    System.out.println("\nTicket price: $" + lowerCost);
                    currentIncome += lowerCost;
                }
                soldTickets++;

                applyBookedSeat(rowNum, seatNum, seatGrid);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong input!");
            buyTicket(rows, seatGrid);
        }
    }

    private static void applyBookedSeat(int rowNum, int seatNum, char[][] seatGrid) {
        for (int i = 0; i < seatGrid.length; i++) {
            for (int j = 0; j < seatGrid[i].length; j++) {
                seatGrid[rowNum - 1][seatNum - 1] = 'B';
            }
        }
    }

    public static void setCinemaGrid(char[][] seatGrid) {
        for (char[] chars : seatGrid) {
            Arrays.fill(chars, 'S');
        }
    }

    private static void getProfit(int rows, int seats, int numberOfSeats) {
        int totalProfit;
        if(numberOfSeats < 60) {
            totalProfit = numberOfSeats * higherCost;
        } else {
            totalProfit = (rows/2) * higherCost * seats + (rows-rows/2) * lowerCost * seats;
        }
        System.out.println("Total income: $" + totalProfit);
    }

    private static void printCinema(int rows, char[][] seatGrid) {
        System.out.println("Cinema: ");
        System.out.print("\0 ");

        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < seats; j++) {
                System.out.print(seatGrid[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static void showStatistics() {
        System.out.println("\nNumber of purchased tickets: " + soldTickets);
        try {
            percentage = (double) soldTickets / (double) numberOfSeats * 100;
            System.out.println("Percentage: " + df.format(percentage) + "%");
        } catch (ArithmeticException e) {
            System.out.println("Percentage: " + df.format(percentage) + "%");
        }
        System.out.println("Current income: $" + currentIncome);
        getProfit(rows, seats, numberOfSeats);
        System.out.println();
    }

}