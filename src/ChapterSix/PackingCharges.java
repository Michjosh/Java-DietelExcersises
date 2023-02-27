package ChapterSix;

/*(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three hours.
The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours.
The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts.
It should use the method calculateCharges to determine the charge for each customer.*/

import java.util.Scanner;

public class PackingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter the number of cars");
        int numberOfCars = input.nextInt();
        int hoursParked;
        int totalHours = 0;
        double totalCharges = 0.0;

        for (int i = 0; i <= numberOfCars; i++) {
            System.out.println("Kindly enter the hours parked for each customer enter -1 to stop: ");
            hoursParked = input.nextInt();
            totalHours++;
            totalCharges += calculateCharges(hoursParked);
            System.out.println("Charge for the current customer is: "+ calculateCharges(hoursParked));
        }
        System.out.printf("TOTAL CARS %d \t TOTAL CHARGES %.2f\n", totalHours, totalCharges);
    }

    private static double calculateCharges(int hoursParked) {
        double charges = 0;
        if (hoursParked <= 3)
            charges = 2.00;
        else if (hoursParked <= 24) {
            for (int hours = 1; hours <= hoursParked; hours++) {
                charges = 2.00 + (0.50 * hours) - 1.50;
            }
        }
        return charges;
    }
}
