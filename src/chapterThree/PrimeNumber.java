package chapterThree;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = input.nextInt();
        int value = 2;

        if (number % value == 0) System.out.println(number + " is a prime number");

        else {
            if (number % value != 0) System.out.println(number + " is not a prime number");

        }
    }

}