package ChapterEight;

public class SavingsAccountClient {
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + i + ":");
            System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
            System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());
            System.out.println();
        }

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New interest rate: 5%");
        System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());
    }
}
