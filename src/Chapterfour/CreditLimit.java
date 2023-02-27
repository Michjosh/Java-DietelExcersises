package Chapterfour;
/*Credit Limit Calculator; Develop a Java application that determines whether any of several department-store customers
has exceeded the credit limit on a charge account. For each customer, the following facts are available:
        a) account number
        b) balance at the beginning of the month
        c) total of all items charged by the customer this month
        d) total of all credits applied to the customer’s account this month
        e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should
display the message "Credit limit exceeded".*/

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello Customer, kindly enter you account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Kindly enter your balance at the beginning of the month");
        int balanceAtBeginning = input.nextInt();
        System.out.println("Kindly enter the total of all items charged this month");
        int totalCharge = input.nextInt();
        System.out.println("Kindly enter the total of all credits applied to your account this month");
        int allCredits = input.nextInt();
        System.out.println("Kindly enter your credit limit for this month");
        int creditLimit = input.nextInt();

        int newBalance = balanceAtBeginning + totalCharge - allCredits;
        System.out.printf("Your new balance is %d:%n", newBalance);

        if (newBalance > creditLimit) System.out.println("Credit limit exceeded");
        else System.out.println("You are within your credit limit");

    }
}
