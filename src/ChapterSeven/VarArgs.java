package ChapterSeven;

/*(Variable-Length Argument List) Write an application that calculates the average of a series
of integers that are passed to method average using a variable-length argument list. Test your method
with several calls, each with a different number of arguments.*/

import java.util.ArrayList;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Kindly enter the total of the number you want to enter: ");
//        int length = input.nextInt();
//        int[] arrayOfNumbers = new int[length];
//        ArrayList1<Double> arrayOfNumbers = new ArrayList1<>();
//        for (int i = 0; i < length; i++) {
//            System.out.println("Kindly enter the series of numbers: ");
//            arrayOfNumbers.add(input.nextDouble());
//        }
//        System.out.println(arrayOfNumbers);
////average(arrayOfNumbers);
        System.out.println("Kindly enter number 1: ");
        double number1 = input.nextDouble();
        System.out.println("Kindly enter number 2: ");
        double number2 = input.nextDouble();
        System.out.println("Kindly enter number 3: ");
        double number3 = input.nextDouble();
        System.out.println("Kindly enter number 4: ");
        double number4 = input.nextDouble();
        System.out.println("Kindly enter number 5: ");
//        double number5 = input.nextDouble();
//        System.out.println("Kindly enter number 6: ");
//        double number6 = input.nextDouble();
//        System.out.println("Kindly enter number 7: ");
//        double number7 = input.nextDouble();
//        System.out.println("Kindly enter number 8: ");
//        double number8 = input.nextDouble();
//        System.out.println("Kindly enter number 9: ");
//        double number9 = input.nextDouble();
//        System.out.println("Kindly enter number 10: ");
//        double number10 = input.nextDouble();

        System.out.println(average(number1,number2,number3,number4));

    }

    private static double average(double...numbers) {
        double total = 0.0;
        for (double element : numbers) total += element;
        double result;
        result = total / numbers.length;
        return result;
    }
}
