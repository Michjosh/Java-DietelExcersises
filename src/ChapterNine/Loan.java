package ChapterNine;

public class Loan {
    protected double principalAmount;
    protected int tenureInMonths;
    protected double interestRate;

    public Loan(double principalAmount, int tenureInMonths, double interestRate) {
        this.principalAmount = principalAmount;
        this.tenureInMonths = tenureInMonths;
        this.interestRate = interestRate;
    }

    public double calculateMonthlyInstallment() {
        double monthlyInterestRate = interestRate / 1200;
        double denominator = 1 - Math.pow(1 + monthlyInterestRate, -tenureInMonths);
        return (principalAmount * monthlyInterestRate) / denominator;
    }
}
