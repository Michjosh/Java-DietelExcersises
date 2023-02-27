package Chapterfour;

/*Tax Calculator Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and
display the citizen’s total tax. Use class Scanner to input the data.*/

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter the citizen's name: ");
        String name = input.nextLine();
        System.out.println("Enter the citizen's earnings in a year: ");
        double earnings = input.nextDouble();
        double totalTax = 0;

        if (earnings == 30_000) {
             totalTax = (earnings * 15) / 100;
        } else if (earnings > 30_000) {
            totalTax = (earnings * 20) / 100;
        }
        System.out.printf("%n %s total tax is : VAT: %.2f%n", name, totalTax);
    }
}
