package Wallet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void deposit5k_balanceIs5kTest(){
        Account account = new Account("matthew", "correctPin", 1);
        account.deposit(5000);
        assertEquals(5000, account.getBalance("correctPin"));
    }

    @Test
    public void deposit5kTwice_get5kTest(){
        Account account = new Account("matthew", "correctPin", 1);
        account.deposit(5000);
        account.deposit(5000);
        account.withdraw(5000, "correctPin");
        assertEquals(5000, account.getBalance("correctPin"));
    }

    @Test
    public void throwErrorForNegativeAmountDepositTest(){
        Account account = new Account("matthew", "correctPin", 1);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, ()->account.deposit(-100));
        assertEquals("Amount must be greater than 0", illegalArgumentException.getMessage());
    }

    @Test
    public void deposit10k_withdraw5k_balanceIs5kTest(){
        Account account = new Account("matthew", "correctPin", 1);
        account.deposit(10000);
        account.withdraw(5000, "correctPin");
        assertEquals(5000, account.getBalance("correctPin"));
    }

    @Test
    public void throwErrorForNegativeAmountWithdrawTest(){
        Account account = new Account("matthew", "correctPin", 1);
        IllegalArgumentException negativeAmountException = assertThrows(IllegalArgumentException.class, ()->account.withdraw(-100, "correctPin"));
        assertEquals("Amount must be greater than 0", negativeAmountException.getMessage());
    }



   @Test
    public void throwExceptionForInsufficientFundsTest(){
        Account account = new Account("matthew", "correctPin", 1);
        IllegalArgumentException insufficientBalanceException = assertThrows(IllegalArgumentException.class, ()->account.withdraw(5000, "correctPin"));
        assertEquals("Insufficient funds, balance is 0.0", insufficientBalanceException.getMessage());
    }

    @Test
    public void throwExceptionForIncorrectPinTest_getBalance(){
        Account account = new Account("matthew", "correctPin", 1);
        IllegalArgumentException incorrectPinException = assertThrows(IllegalArgumentException.class, ()->account.getBalance("wrongPin"));
        assertEquals("Incorrect credentials",incorrectPinException.getMessage());
    }

    @Test
    public void throwExceptionForIncorrectPinTest_withdrawal(){
        Account account = new Account("matthew", "correctPin", 1);
        IllegalArgumentException incorrectPinException = assertThrows(IllegalArgumentException.class, ()->account.withdraw(200,"wrongPin"));
        assertEquals("Incorrect credentials",incorrectPinException.getMessage());
    }

    @Test
    public void testThatUpdatePinWorks(){
        Account account = new Account("matthew", "correctPin", 1);
        account.updatePin("correctPin", "newPin");
        assertEquals("newPin", account.getPin());
    }
}