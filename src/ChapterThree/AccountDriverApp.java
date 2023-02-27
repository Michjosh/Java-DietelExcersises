package ChapterThree;

import java.util.Scanner;

public class AccountDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AccountServerClass account1 = new AccountServerClass("Null", 0.0);
        AccountServerClass account2 = new AccountServerClass("Null", 0.0);

        System.out.println("""
                Welcome to Mikul Best Account, You're about to open a savings account for two. Be ready to make an initial deposit immediately, thank you""");
        displayAccount(account1, account2);
        System.out.println("Please enter the first name: ");
        String firstName = input.nextLine();
        account1.setName(firstName);

        System.out.println("Please enter the second name: ");
        String secondName = input.nextLine();
        account2.setName(secondName);

        System.out.println("Kindly make a deposit to the first account: ");
        double firstAmount = input.nextDouble();
        account1.deposit(firstAmount);
        System.out.printf("%nAdding to first account balance: #%.2f%n", firstAmount);

        System.out.println("Kindly make a deposit to the second account: ");
        double secondAmount = input.nextDouble();
        account2.deposit(secondAmount);
        System.out.printf("%nAdding to second account balance: #%.2f%n", secondAmount);
        displayAccount(account1,account2);

        System.out.println("How much do you want to withdraw from the first account: ");
        double withdrawal1 = input.nextDouble();
        account1.withdraw(withdrawal1);
        System.out.println("How much do you want to withdraw from the second account: ");
        double withdrawal2 = input.nextDouble();
        account2.withdraw(withdrawal2);
        displayAccount(account1,account2);

    }

    public static void displayAccount(AccountServerClass accountServerClass1, AccountServerClass accountServerClass2) {
        System.out.printf("%nName of the first accounts is: %s. Balance is #%.2f%n", accountServerClass1.getName(), accountServerClass1.getBalance());
        System.out.printf("Name of the second accounts is: %s. Balance is #%.2f%n", accountServerClass2.getName(), accountServerClass2.getBalance());
    }
}
