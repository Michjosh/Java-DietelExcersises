package ChapterTwo;
/*Write an application that reads an integer and determines and prints
 whether it’s divisible by 3 or not. [Hint: Use the remainder operator.
 A number is divisible by 3 if it’s divided by 3 with a remainder of 0.]*/

import java.util.Scanner;

public class DividedByThree {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = entry.nextInt();

        if (number %3 == 0) System.out.printf("%d is divisible by 3%n", number);
        if (number %3 !=0) System.out.printf("%d is not divisible by 3%n", number);
    }
}
