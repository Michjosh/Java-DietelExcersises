package ChapterThree;
/*(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
Ensure that the withdrawal amount does not exceed
the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw*/

public class AccountServerClass {
    private String name;
    private double balance;

    public AccountServerClass(String name, double balance) {
        this.name = name;

        if (balance > 0.0) this.balance = balance;
    }

    public void deposit(double depositAmount){
        if (depositAmount >0.0) balance = balance + depositAmount;
    }

    public void withdraw(double amountToWithdraw){
        if (amountToWithdraw < balance) balance = balance - amountToWithdraw;
        else System.out.println("Withdrawal amount exceeded account balance.");
    }
    public double getBalance(){
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
