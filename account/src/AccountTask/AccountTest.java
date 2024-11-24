package AccountTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void desposit5h_get5hTest() {
        Account account = new Account(0);
        int result = account.getBalance();
        int expect = 0;
        assertEquals(expect, result);
        int amount = 500;
        account.deposit(amount);
        int expect1 = 500;
        assertEquals(expect1, account.getBalance());
    }

    @Test
    public void desposit5hTwice_get1kTest() {
        Account account = new Account(0);
        int result = account.getBalance();
        int expect = 0;
        assertEquals(expect, result);
        int amount = 500;
        account.deposit(amount);
        account.deposit(amount);
        int expect1 = 1000;
        assertEquals(expect1, account.getBalance());
    }

@Test
    public void withdraw5h_get5hBalanceTest() {
        Account account = new Account(0);
        account.deposit(500);
        account.deposit(500);
        account.withdraw(500);
        assertEquals(500, account.getBalance());

    }
    @Test
    @DisplayName("where current balance is 50,000")
    public void withdraw50100_get50000(){
        Account account = new Account(0);
        account.deposit(50000);
        account.withdraw(50100);
        int expected = 50000;
        assertEquals(expected,account.getBalance());
    }

    @Test
    @DisplayName("where the balance is zero, return zero")
    public void withdrawNegative5h_getZero(){
        Account account = new Account(0);
        account.withdraw(-500);
        assertEquals(0, account.getBalance());
    }


}
