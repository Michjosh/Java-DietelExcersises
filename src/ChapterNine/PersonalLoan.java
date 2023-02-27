package ChapterNine;

public class PersonalLoan extends Loan{
    public PersonalLoan(double principalAmount, int tenureInMonths, double interestRate) {
        super(principalAmount, tenureInMonths, 12.0);
    }
}
