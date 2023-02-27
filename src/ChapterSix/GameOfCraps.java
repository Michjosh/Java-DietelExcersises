package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameOfCraps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static double bankBalance = 1000.00;

    private enum Status {CONTINUE, WON, LOST}
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0;
        Status gamesStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gamesStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gamesStatus = Status.LOST;
            default -> {
                gamesStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }
        while (gamesStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gamesStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gamesStatus = Status.LOST;
                }
            }
        }
        if (gamesStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }

    }

    private static void wager() {
        System.out.println("Enter a wager");
        Scanner entry = new Scanner(System.in);
        int wager = entry.nextInt();
        if (wager <= bankBalance){
            rollDice();
        }
        else {
            System.out.println("Re-enter wager");
        }

    }

    private static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Players rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

}
