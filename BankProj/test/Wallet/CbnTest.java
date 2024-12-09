package Wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CbnTest {
    @Test
    public void createBank_getNumberOfBanks(){
        Cbn cbn = new Cbn();
      Bank fidelityBank = cbn.registerBank("Fidelity Bank");
      Bank fcmb = cbn.registerBank("fcmb");
      Bank correct = cbn.registerBank("Correct Bank");
      assertEquals(3, cbn.getBankNumber());
    }


    @Test
    public void createAccounts_getAccountNumber(){
        Bank accessBank = new Bank();
        Account account1 = accessBank.createAccount("Tony", "Nwabueze", "1235");
        Account account2 = accessBank.createAccount("Suleman", "Nwabueze", "1235");
        assertEquals(2, account2.getNumber());
    }


    @Test
    public void transfer5kfromFidelityBankTofcmbBank_get5kBalanceFromFidelityBank(){
        Cbn cbn = new Cbn();
        Bank fidelityBank = cbn.registerBank("Fidelity Bank");
        Account account1 = fidelityBank.createAccount("Anthony", "Chris", "1234");
        fidelityBank.deposit(1,10_000);
        assertEquals(10_000, account1.getBalance("1234"));

        Bank fcmb = cbn.registerBank("fcmb");
        Account anthony = fcmb.createAccount("Anthony", "Chris", "1234");
        Account sodiq = fcmb.createAccount("Sodiq", "Chris", "1234");
        assertEquals(2, fcmb.getAccountNumber());

        cbn.transfer(1, 2, 1, 2, 5000.0, "1234");
        assertEquals(5000, sodiq.getBalance("1234"));

    }

    @Test
    public void throwExceptionIfBankIsNotFound(){
        Cbn cbn = new Cbn();
        Bank fidelityBank = cbn.registerBank("Fidelity Bank");
        Bank fcmb = cbn.registerBank("fcmb");
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, ()->cbn.findBank(3));
        assertEquals("Bank does not exist", illegalArgumentException.getMessage());
    }



}
