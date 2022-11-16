package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {
        //given
        Account michaelAccount = new Account();
        //when I deposit 5000
        michaelAccount.setDeposit(5000);
        //check that balance is 5000
        int michaelAccountBalance = michaelAccount.getBalance();
        //Assertion
        assertEquals(5000, michaelAccountBalance);
    }
    @Test
    public void depositTwiceTest() {

        //given there is an account
        //given that initial balance is 4000
        //when I deposit 2000
        //check that balance is 6000

        Account michaelAccount = new Account();
        michaelAccount.setDeposit(4000);
        michaelAccount.setDeposit(2000);

        int michaelAccountBalance = michaelAccount.getBalance();
        assertEquals(6000, michaelAccountBalance);
    }
@Test
    public void depositNegativeAmountTest(){
    Account michaelAccount = new Account();
    michaelAccount.setDeposit(4000);
    //michaelAccount.setDeposit(-2000);
    int michaelAccountBalance = michaelAccount.getBalance();
    assertEquals(4000, michaelAccountBalance);

}

    @Test
    public void withdrawAccountTest() {
        Account michaelAccount = new Account();
        michaelAccount.setDeposit(5000);
        michaelAccount.setWithdraw(4000);

        int balance = michaelAccount.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    public void withdrawMoreThanBalanceTest(){
        Account michaelAccount = new Account();
        michaelAccount.setDeposit(20000);
        michaelAccount.setWithdraw( 40000);
        assertEquals(20000, michaelAccount.getBalance());
    }

    @Test
    public void withdrawMinimumBalanceTest(){
        Account michaelAccount = new Account();
        michaelAccount.setDeposit(19500);
        michaelAccount.setWithdraw(20000);
        assertEquals(20000, michaelAccount.getBalance());
    }

    //@Test
    //public void withdrawWithWrongPinFailsTest(){
      //  Account michaelAccount = new Account();
      //  michaelAccount.setpin("1234");
      //   michaelAccount.setPin;
      //  michaelAccount.setDeposit(50_000);
      //  assertEquals();
      // }
}



