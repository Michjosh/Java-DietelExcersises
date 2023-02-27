package Chapterfour;

/*(Reading numbers until a specified sum) Write an application that asks for a number from
the user and then keeps reading integer values from the user until the sum of those integers equals
or becomes greater than the value that was input in the beginning.*/

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user, kindly enter a top number: ");
        int topNumber = input.nextInt();
        int sum = 0;

        while (sum < topNumber) {
            System.out.println("Kindly an integer");
            int newNumber = input.nextInt();
            sum += newNumber;
        }
    }
}