package tdd;

public class Account {
    private int balance;
    private int deposit;
    private int withdraw;

    public void setDeposit(int fiat) {
        if (fiat > 0) {
            balance = balance + fiat;
        }
    }

    public int getDeposit() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setWithdraw(int fiat) {
        int minimumBalance = 1000;
        if (fiat < (balance- minimumBalance)){
            balance = balance - fiat;
        }
    }
}
