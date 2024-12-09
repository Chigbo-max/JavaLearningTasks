package Wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    public void createAccount_getAccountNumberTest() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount("Awele", "Ada", "correctPin");
        Account account2 = bank.createAccount("Ebenezer", "Ada", "sharpGuy");
        assertEquals(2, account2.getNumber());
    }

    @Test
    public void deposit5k_get5kBalanceTest() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount("Awele", "Ada", "correctPin");
        account1.deposit(5000);
        assertEquals(5000, bank.getBalance(1,"correctPin"));
    }

    @Test
    public void deposit5kTwice_get5kBalanceTest() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount("Awele", "Ada", "correctPin");
        account1.deposit(5000);
        account1.deposit(5000);
        account1.withdraw(5000, "correctPin");
        assertEquals(5000, bank.getBalance(1,"correctPin"));
    }

    @Test
    public void throwExceptionForWrongPinTest() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount("Awele", "Ada", "correctPin");
        account1.deposit(5000);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()->bank.withdraw(1, 5000, "wrongPin"));
        assertEquals("Invalid credentials", e.getMessage());
    }

    @Test
    public void throwExceptionIfAccountNumberIsOutOfBoundTest() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount("Awele", "Ada", "correctPin");
        account1.deposit(5000);
        IllegalArgumentException f = assertThrows(IllegalArgumentException.class, ()->bank.withdraw(3, 500, "correctPin"));
        assertEquals("3 is not a valid account number", f.getMessage());
    }

    @Test
    public void transfer5kToAnotherAccount_get3kBalanceTest() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount("Awele", "Ada", "correctPin");
        Account account2 = bank.createAccount("Ebenezer", "Ada", "correctPin");
        account1.deposit(8000);
        assertEquals(8000, bank.getBalance(1,"correctPin"));
        account2.deposit(5000);
        assertEquals(5000, bank.getBalance(2,"correctPin"));
        account1.withdraw(5000, "correctPin");
        assertEquals(3000, bank.getBalance(1,"correctPin"));
    }

    @Test
    public void transfer5kToAnotherAccount_get1kBalanceTest() {
        Bank bank = new Bank();
        Account account1 = bank.createAccount("Awele", "Ada", "correctPin");
        Account account2 = bank.createAccount("Ebenezer", "Ada", "correctPin");
        account1.deposit(5000);
        assertEquals(5000, bank.getBalance(1,"correctPin"));
        account2.deposit(4000);
        assertEquals(4000, bank.getBalance(2,"correctPin"));

        account1.withdraw(4000, "correctPin");
        assertEquals(1000, bank.getBalance(1,"correctPin"));



    }

}
