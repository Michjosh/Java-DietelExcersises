package chapterThree;

import java.util.Scanner;

public class Looping{

        public static void main(String[] args)
        {
            int smallest;
            int largest;
            int number;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter some numbers: ");
            System.out.println("Enter -11 when finished.");
            System.out.println();

            number = input.nextInt();

            smallest = number;
            largest = number;

            while (number != -11)
            {
                if(number > largest)
                {
                    largest = number;
                }
                if(number < smallest)
                {
                    smallest = number;
                }
                number = input.nextInt();
            }
            System.out.println("The largest number is:" + largest);
            System.out.println("The smallest number is : "  + smallest);
        }
    }

