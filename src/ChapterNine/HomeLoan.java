package ChapterNine;

public class HomeLoan extends Loan{

    public HomeLoan(double principalAmount, int tenureInMonths, double interestRate) {
        super(principalAmount, tenureInMonths, 7.5);
    }
}
