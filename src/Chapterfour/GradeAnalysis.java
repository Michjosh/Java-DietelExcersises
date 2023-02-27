package Chapterfour;

import java.util.Scanner;

public class GradeAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int successes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;

        while (studentCounter <=10) {
            System.out.println("enter result, (1 for pass, 2 for fail: ");
             result = input.nextInt();

            if (result == 1) {
                successes++;
            }
            else {
                failures++;
            }
            studentCounter++;
        }
        System.out.printf("Passes: %d%n Failed %d%n", successes, failures);

        if (successes > 8) {
            System.out.println("Give bonus to the instructor");
        }

    }
}
