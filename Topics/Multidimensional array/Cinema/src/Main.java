import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get number of rows and seats from user
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        //Create grid - all values initialized to 0
        int[][] room = new int[rows][seats];

        //Populate the room with user input
        for (int row = 0; row < rows; row++) {
            for (int seat = 0; seat < seats; seat++) {
                room[row][seat] = scanner.nextInt();
            }
        }

        //Get the desired number of seats from user
        int desiredSeats = scanner.nextInt();

        //Set a counter for the number of seats that are empty (0) side by side
        int emptySeats = 0;

        //Set a variable for located row, we are assuming there isn't one available
        int locatedRow = 0;

        //Create a flag that will help us terminate our search loop.
        boolean found = false;

        //Iterate over each row and check if enough empty seats
        for (int row = 0; row < rows; row++) {
            for (int seat = 0; seat < seats; seat++) {
                if (room[row][seat] == 0) {
                    emptySeats++;
                } else {
                    emptySeats = 0;
                }

                if (emptySeats == desiredSeats) {
                    locatedRow = row + 1; //We add one as we are using index value which starts at zero
                    found = true;
                }
            }
            if (found) {
                break; // We have found the row we are looking for and terminate the search
            }
            //Restart the seat count for each new row
            emptySeats = 0;
        }
        //Print result
        System.out.println(locatedRow);
    }
}