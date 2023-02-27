package ChapterTwo;

import java.util.Scanner;

public class WhileAg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers, press 0 to stop ");

        int stopper = input.nextInt();
        int smallest = stopper;
        int largest = stopper;

        while (stopper != 0) {
            System.out.println("Enter some another numbers, press 0 to stop ");
            stopper = input.nextInt();

            if (stopper > largest) {
                largest = stopper;
            }
            if (stopper < smallest) {
                smallest = stopper;
            }

        }
        System.out.println("The largest number is:" + largest);
        System.out.println("The smallest number is : " + smallest);

    }
}

