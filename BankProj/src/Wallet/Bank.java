package Wallet;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    Cbn cbn = new Cbn();
    List<Account> accounts = new ArrayList<Account>();
    private int accountNumber;
    private int id;
    private String name;


    public Bank(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Bank() {

    }

    public Account createAccount(String firstName, String lastName, String pin) {
        accountNumber++;
        String name = firstName + " " + lastName;
        Account newAccount = new Account(name, pin, accountNumber);
        accounts.add(newAccount);
        return newAccount;
    }

    public int getBankId() {
        return id;
    }

    public String getBankName(){
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void deposit(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public double getBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public void withdraw(int accountNumber, double amount, String pin) {
       Account account =  findAccount(accountNumber);
        validatePin(pin, account);
        account.withdraw(amount, pin);
    }

    public void transfer(int senderAccount, int recipientAccount, double amount, String pin) {
        Account sender = findAccount(senderAccount);
        Account recipient = findAccount(recipientAccount);
        validatePin(pin, sender);
        recipient.deposit(amount);
        sender.withdraw(amount, pin);
    }


    public Account findAccount(int accountNumber){
        validateAccount(accountNumber);
        return accounts.get(accountNumber - 1);
    }


    private void validateAccount(int accountNumber) {
        if (accountNumber < 1 || accountNumber > accounts.size()) {
            throw new IllegalArgumentException(accountNumber + " is not a valid account number");
        }
    }
    private void validatePin(String pin, Account account) {
        if(!pin.equals(account.getPin())) throw new IllegalArgumentException("Invalid credentials");
    }


}
