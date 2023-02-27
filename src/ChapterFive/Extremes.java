package ChapterFive;

/*(Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.*/

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("How many number do you want to enter: ");
        int number = entry.nextInt();
        int minimum = number;
        int maximum = number;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Kindly enter 10 numbers: ");
            number = entry.nextInt();
            if (number > maximum) maximum = number;
            if (number < minimum) minimum = number;
        }
        System.out.printf("%nSum of the minimum and maximum numbers is: %d", maximum + minimum);
    }
}
