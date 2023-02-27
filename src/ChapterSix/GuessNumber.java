package ChapterSix;

/*(Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again.
Note: The guessing technique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.*/

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int guessedNumber;
        int correctNumber = 1 + random.nextInt(1000);
        System.out.println(correctNumber);

        while (true) {
            System.out.println("Guess a number: ");
            guessedNumber = input.nextInt();
            if (guessedNumber == correctNumber) {
                System.out.printf("%nCongratulations, the correct number is %d", correctNumber);
                break;
            } else if (guessedNumber > correctNumber) {
                System.out.printf("%n%d is too high from correct number, Guess again or press -1 to exit the game: ", guessedNumber);
            } else
                System.out.printf("%n%d is too low from correct number, Guess again or press -1 to exit the game: ", guessedNumber);
        }
    }
}
