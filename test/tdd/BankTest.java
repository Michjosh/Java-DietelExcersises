import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MikulBank.Bank;

import java.math.BigDecimal;


import static org.testng.AssertJUnit.assertEquals;

public class BankTest {
    private Bank myBank;
    @BeforeEach
    public void StartEachTestWith() {
        myBank = new Bank();
        myBank.createAccountFor("Michael", "Joshua", "1234");

    }

    @Test
    public void accountCanBeCreatedBankTest() {
        assertEquals(1, myBank.getNumberOfCustomers());
    }

    @Test
    public void accountCanBeFoundAfterCreation() {
        String expected = """
                =============================
                Account Name: Michael Joshua
                Account Number: 1
                Account balance: $0
                =============================
                """;
        assertEquals(expected, myBank.findAccount(1).toString());
    }

    @Test
    public void balanceCanBeCheckedTest() {
        assertEquals("0", myBank.checkBalanceFor(1, "1234").toPlainString());
    }

    @Test
    public void depositIntoAccountTest(){
        myBank.depositInto(1, BigDecimal.valueOf(50));
        assertEquals(BigDecimal.valueOf(50), myBank.checkBalanceFor(1, "1234"));
    }

    @Test
    public void withDrawFromAccountTest(){
        myBank.depositInto(1, BigDecimal.valueOf(50));
        myBank.withDrawFrom(1, BigDecimal.valueOf(30), "1234");
        assertEquals(BigDecimal.valueOf(20), myBank.checkBalanceFor(1, "1234"));
    }

    @Test
    public void transferMoneyTest(){
        myBank.createAccountFor("Josh", "Mike", "1235");
        myBank.depositInto(2, BigDecimal.valueOf(5000));

        myBank.transfer(BigDecimal.valueOf(2000), 2, 1, "1235");

        assertEquals(BigDecimal.valueOf(2000), myBank.checkBalanceFor(1, "1234"));
        assertEquals(BigDecimal.valueOf(3000), myBank.checkBalanceFor(2, "1235"));
    }
    @Test
    public void testThatAccountCanBeClosed(){
        myBank.createAccountFor("Mich","Josh","2468");
        myBank.closeAccount(2);
        assertEquals(1, myBank.getNumberOfCustomers());

    }
}