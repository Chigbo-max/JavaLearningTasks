package Wallet;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts = new ArrayList<Account>();
    private int accountNumber;
//    private int numberOfAccounts;
//    private double balance;

    public Account createAccount(String firstName, String lastName, String pin) {
        accountNumber++;
//        numberOfAccounts++;
        String name = firstName + " " + lastName;
//        int accountNumber = numberOfAccounts;
//        String accountNumber = Integer.toString(numberOfAccounts);
        Account newAccount = new Account(name, pin, accountNumber);
        accounts.add(newAccount);
        return newAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

//    public int getNumberOfAccounts() {
//        return numberOfAccounts;
//    }

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
//        sender.deposit(amount);
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
