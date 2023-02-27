package ChapterSeven;
import java.util.Scanner;

/*Airline Reservations System A small airline has just purchased a computer for its new automated reservations' system.
You’ve been asked to develop the new system. You’re to write an application to assign seats on
each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy. If the user types 1, your application should assign a seat in the first class
section (seats 1–5). If the user types 2, your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."*/

public class ReservationSystem {

    private boolean[] seats; // boolean array to represent the seating chart
    private static final int NUM_SEATS = 10; // total number of seats
    private static final int FIRST_CLASS_SIZE = 5; // number of seats in first class
    private static final int ECONOMY_SIZE = NUM_SEATS - FIRST_CLASS_SIZE; // number of seats in economy
    private static final int FIRST_CLASS_START = 0; // index of first seat in first class
    private static final int ECONOMY_START = FIRST_CLASS_SIZE; // index of first seat in economy

    public ReservationSystem() {
        seats = new boolean[NUM_SEATS];
        // Initialize all seats false to indicate that they are empty
        for (int i = 0; i < NUM_SEATS; i++) {
            seats[i] = false;
        }
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Please type 1 for First Class and 2 for Economy.");
            choice = input.nextInt();
            if (choice == 1) {
                assignSeat(FIRST_CLASS_START, FIRST_CLASS_SIZE, "First Class");
            } else if (choice == 2) {
                assignSeat(ECONOMY_START, ECONOMY_SIZE, "Economy");
            }
        } while (choice == 1 || choice == 2);
    }

    private void assignSeat(int start, int size, String section) {
        boolean found = false;
        // Look for the first empty seat in the section
        for (int i = start; i < start + size; i++) {
            if (!seats[i]) {
                seats[i] = true; // mark the seat as occupied
                found = true;
                System.out.printf("Boarding Pass: Seat %d in %s section\n", i + 1, section);
                break;
            }
        }
        if (!found) {
            // No empty seats in the section
            System.out.printf("Sorry, the %s section is full.\n", section);
            if (section.equals("Economy")) {
                // Ask if the passenger is willing to be placed in first class
                System.out.println("Would you like to be placed in the First Class section? (1 for Yes, 2 for No)");
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                if (choice == 1) {
                    assignSeat(FIRST_CLASS_START, FIRST_CLASS_SIZE, "First Class");
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            } else {
                // First class is full and no seats are available
                System.out.println("Sorry, the First Class section is also full.");
                System.out.println("Next flight leaves in 3 hours.");
            }
        }
    }
}
