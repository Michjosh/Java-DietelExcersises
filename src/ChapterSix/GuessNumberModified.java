package ChapterSix;

/*Guess-the-Number Modification) Modify the program of Exercise 6.30 to count the number of guesses the player makes.
If the number is 10 or fewer, display Either you know the secret
or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
If the player makes more than 10 guesses, display You should be able to do better! Why should it
take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
half of the numbers, then half of the remaining numbers, and so on.*/

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberModified {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int guessedNumber;
        int correctNumber = 1 + random.nextInt(1000);
//        System.out.println(correctNumber);
        int numberOfTries = 0;

        while (true) {
            System.out.println("Guess a number: ");
            guessedNumber = input.nextInt();
            if (guessedNumber == correctNumber) {
                System.out.printf("%nCongratulations, the correct number is %d", correctNumber);
                break;
            } else if (guessedNumber > correctNumber) {
                System.out.printf("%n%d is too high from correct number, Guess again or press -1 to exit the game: ", guessedNumber);
            } else if (guessedNumber < correctNumber) {
                System.out.printf("%n%d is too low from correct number, Guess again or press -1 to exit the game: ", guessedNumber);
                numberOfTries++;
            }
        }
        if (numberOfTries < 10) {
            System.out.println(" Either you know the secret or you got lucky!");
        }
        if (numberOfTries == 10) {
            System.out.println("Aha! You know the secret!");
        }
        if (numberOfTries > 10) {
            System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
        }
    }
}