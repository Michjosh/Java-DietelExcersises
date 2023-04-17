package ChapterFifteen;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditEnquiry {
private final static MenuOptions[] choices = MenuOptions.values();
 public static void main(String[] args) {
Scanner input = new Scanner(System.in);
// get user's request (e.g., zero, credit or debit balance)
 MenuOptions accountType = getRequest(input);

while (accountType != MenuOptions.END) {
    switch (accountType) {
        case ZERO_BALANCE -> System.out.printf("%nAccounts with zero balances:%n");
        case CREDIT_BALANCE -> System.out.printf("%nAccounts with credit balances:%n");
        case DEBIT_BALANCE -> System.out.printf("%nAccounts with debit balances:%n");
    }
               readRecords(accountType);
                accountType = getRequest(input); // get user's request
                }
            }

         private static MenuOptions getRequest(Scanner input) {
            int request = 4;
            System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                    " 1 - List accounts with zero balances",
                    " 2 - List accounts with credit balances",
                    " 3 - List accounts with debit balances",
                     " 4 - Terminate program");
            try {
                 do { // input user request
                    System.out.printf("%n? ");
                    request = input.nextInt();
                    } while ((request < 1) || (request > 4));
                }
             catch (NoSuchElementException noSuchElementException) {
                 System.err.println("Invalid input. Terminating.");
            }
            return choices[request - 1]; // return enum value for option
             }
// read records from file and display only records of appropriate type
 private static void readRecords(MenuOptions accountType) {
// open file and process contents
 try (Scanner input = new Scanner(Paths.get("C:\\Users\\DELL\\Desktop\\Michael\\IdeaProjects\\theSeedProjects\\src\\ChapterFifteen\\myFile.txt")) ) {
 while (input.hasNext()) { // more data to read
              int accountNumber = input.nextInt();
              String firstName = input.next();
              String lastName = input.next();
              double balance = input.nextDouble();

              // if proper account type, display record
     if (shouldDisplay(accountType, balance)) {
                     System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,
                            firstName, lastName, balance);
                    }
                 }
             }
         catch (NoSuchElementException | IllegalStateException |
                IOException e) {
             System.err.println(e.getMessage());
            System.exit(1);
             }
         }

         private static boolean shouldDisplay(
 MenuOptions option, double balance) {
         if ((option == MenuOptions.CREDIT_BALANCE) && (balance < 0)) {
             return true;
             }
         else if ((option == MenuOptions.DEBIT_BALANCE) && (balance > 0)) {
             return true;
             }
         else if ((option == MenuOptions.ZERO_BALANCE) && (balance == 0)) {
             return true;
             }

         return false;
         }
}
