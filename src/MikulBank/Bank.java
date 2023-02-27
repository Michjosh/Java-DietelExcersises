package MikulBank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Account> accounts = new ArrayList<>();

    public void createAccountFor(String firstname, String lastName, String pin){
        String accountNumber = String.valueOf(accounts.size()+1);
        Account newAccount = new Account(pin, firstname+" "+lastName, accountNumber);
        accounts.add(newAccount);

    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber){
        return accounts.get(accountNumber -1);

    }
    public BigDecimal checkBalanceFor(int accountNumber, String pin){
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public void depositInto(int accountNumber, BigDecimal amount) {
    Account account = findAccount(accountNumber);
    account.deposit(amount);
    }

    public void withDrawFrom(int accountNumber, BigDecimal amount, String pin) {
        findAccount(accountNumber).withDraw(amount,pin);

    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);

        senderAccount.withDraw(amount,senderPin);
        receiverAccount.deposit(amount);

    }

    public void closeAccount(int accountNumber) {
        Account account = findAccount(accountNumber);
        accounts.remove(account);
    }
}