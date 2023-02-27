package Chapterfour;

/*(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.*/

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int largest = 0;
        int second = 0;

        while (counter != 10) {
            System.out.println("Kindly enter the number of units sold by the sales person: ");
            int number = input.nextInt();
            if (number > largest)
                largest = number;
            else if (number > second) second = number;
            counter++;
            }
        System.out.printf("The fist largest number is: %d%n", largest);
        System.out.printf("The second largest number is: %d", second);
    }
}