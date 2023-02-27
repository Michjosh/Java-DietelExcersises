package Chapterfour;
/*(Gas Mileage) Drivers are concerned with the mileage their automobiles get.
One driver has kept track of several trips by recording the miles driven and
gallons used for each tankful. Develop a Java application that will input the miles driven and
gallons used (both as integers) for each trip. The program should calculate and
display the miles per gallon obtained for each trip and print the combined miles per gallon
obtained for all trips up to this point. All averaging calculations should produce
floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user.*/

import java.util.Scanner;

public class GasMileage {
    private static int milesPerGallon = 0;
    private static int total = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven for each trip");
        int miles = input.nextInt();
        System.out.println("Enter the number of gallons used for each trip");
        int gallons = input.nextInt();
        int counter = 0;

        while (miles != -1) {
            milesPerGallon = miles / gallons;
            total += counter;

            System.out.println("Enter the number of miles driven for each trip enter -1 to stop");
            miles = input.nextInt();
            if (miles == -1) display();
            System.out.println("Enter the number of gallons used for each trip enter -1 to stop");
            gallons = input.nextInt();

            counter++;
        }

    }
    public static void display(){
        double milesPerGallonCombined = (double) milesPerGallon / total;
        System.out.printf("The miles per gallon for each trip is: %d%n", milesPerGallon);
        System.out.printf("The combined miles per gallon for all the trip is: %.2f%n", milesPerGallonCombined);
        System.exit(1);
    }
}
