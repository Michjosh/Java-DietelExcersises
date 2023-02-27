package MikulBank;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;

    private final String accountName;

    private final String accountNumber;

    public Account(String accountPin, String accountName, String accountNumber) {
        this.pin = accountPin;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance(String accountPin) {
       validatePin(accountPin);
        return balance;
}


    private void validatePin(String accountPin){
        if (!accountPin.equals((this.pin))) throw new IllegalArgumentException("Invalid Pin");
    }

    public void deposit(BigDecimal amount) {
    balance = balance.add(amount);

    }

    public void withDraw(BigDecimal amountToWithdraw, String accountPin) {
        validatePin(accountPin);
       if (balance.compareTo(amountToWithdraw) < 0) throw new IllegalArgumentException("Wrong Amount");
       balance = balance.subtract(amountToWithdraw);
    }

    @Override
    public String toString(){
        return String.format("""
                =============================
                Account Name: %s
                Account Number: %s
                Account balance: $%s
                =============================
                """
                , accountName, accountNumber, balance.toPlainString());
    }
}