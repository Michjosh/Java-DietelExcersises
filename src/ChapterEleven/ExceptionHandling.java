package ChapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.println("please enter an integer numerator : ");
                int numerator = entry.nextInt();
                System.out.println("please enter an integer denominator: ");
                int denominator = entry.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("%nException: %s%n", inputMismatchException);
                entry.nextLine();
                System.out.printf("You must enter an integer: please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. please try again.%n%n");
                arithmeticException.printStackTrace();
            }
        } while (continueLoop);
    }
}
