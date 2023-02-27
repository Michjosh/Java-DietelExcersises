package Chapterfour;

/*Palindromes A palindrome is a sequence of characters that reads the same backward as forward.
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
If the number is not five digits long, display an error message and allow the user to enter a new value.*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter five number to test for palindrome");
        int number = input.nextInt();

        int reversedNumber = 0;
        int remainder;
        int originalNumber = number;

        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is Palindrome.");
        } else {
            System.out.println(originalNumber + " is not Palindrome.");
        }
    }
}
