package Chapterfour;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
//        int temperature = 40;
//        if (age >= 90)
//            System.out.println("a");
//        else if (age >= 80)
//            System.out.println("be");
//        else if (age >= 70)
//            System.out.println("c");
//        else if (age >= 60)
//            System.out.println("d");
//        else
//            System.out.println("f");
//        if (temperature >= 50)
//                if (temperature >= 80)
//                    System.out.println(("Good day for swimming"));
//                else
//                    System.out.println("Good day for golfing");
//        else
//            System.out.println("Good day for tennis");
//        System.out.println("Guess password");
//        String password = "let me in";
//        Scanner entry = new Scanner(System.in);
//        String guess = entry.nextLine();
//
//        while (!guess.equals(password)){
//            System.out.println("guess the password");
//            guess = entry.nextLine();
//        }
//        System.out.println("congrats");

//       Scanner entry = new Scanner(System.in);
//       int number;
//       int sum, average;
//       int limit;
//       int counter;
//
//        System.out.println("Pleases enter the number that would be used as limit");
//        limit = entry.nextInt();

//        sum = 0;
//        counter= 0;
//
//        System.out.println("Great, type in "+ limit + " numbers");
//
//        while (counter < limit) {
//            number = entry.nextInt();
//            sum += number;
//            counter++;
//        }
//        System.out.println(" The some of all the number is " + sum);
//        if (counter != 0) {
//            average = sum/counter;
//            System.out.println("The average of all the numbers is "+ average);
//        }
//        else {
//            System.out.println("There was no input");
//        }
        int x = -2;
         int total = 0;

         while (x <= 10) {
             int y = x + 2;
             x++;
             total += y;
             System.out.printf("Y is: %d and total is %d\n", y, total);
         }
   }
}
