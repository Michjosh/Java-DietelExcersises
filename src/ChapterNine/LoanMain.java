package ChapterNine;

import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter tenure in months: ");
        int tenureInMonths = input.nextInt();

        HomeLoan homeLoan = new HomeLoan(principalAmount, tenureInMonths, 7.5);
        VehicleLoan vehicleLoan = new VehicleLoan(principalAmount, tenureInMonths, 9.5);
        PersonalLoan personalLoan = new PersonalLoan(principalAmount, tenureInMonths, 12.0);

        System.out.println("Monthly installment for Home Loan: " + homeLoan.calculateMonthlyInstallment());
        System.out.println("Monthly installment for Vehicle Loan: " + vehicleLoan.calculateMonthlyInstallment());
        System.out.println("Monthly installment for Personal Loan: " + personalLoan.calculateMonthlyInstallment());

        input.close();
    }
}
